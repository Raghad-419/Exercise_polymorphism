import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();
        System.out.println("Welcome to Vehicle Rental System");
        int number ;

        try { do {

              System.out.println("Select service number");
              System.out.println("1- Rent a car");
              System.out.println("2- Rent a Bike");
              System.out.println("3- Rent a Truck");
              System.out.println("4- View Rented Vehicles");
              System.out.println("5- Exit");
              number = input.nextInt();
              switch (number) {
                  case 1:
                      System.out.println("Enter Car Model");
                      input.nextLine();
                      String model = input.nextLine();
                      System.out.println("Enter Rental Days");
                      int days = input.nextInt();
                      Vehicle car = new Car(model, days);
                      car.calculateRentalCost();
                      car.displayDetails();
                      rentedVehicles.add(car);
                      break;
                  case 2:
                      System.out.println("Enter Bike Brand");
                      input.nextLine();
                      String brand = input.nextLine();
                      System.out.println("Enter Rental Hours");
                      int hours = input.nextInt();
                      Vehicle bike = new Bike(brand, hours);
                      bike.calculateRentalCost();
                      bike.displayDetails();
                      rentedVehicles.add(bike);
                      break;
                  case 3:
                      System.out.println("Enter Truck Type");
                      input.nextLine();
                      String type = input.nextLine();
                      System.out.println("Enter Rental Weeks");
                      int weeks = input.nextInt();
                      Vehicle truck = new Truck(type, weeks);
                      truck.calculateRentalCost();
                      truck.displayDetails();
                      rentedVehicles.add(truck);
                      break;
                  case 4:
                      System.out.println("Rented Vehicles:");
                      for (Vehicle v : rentedVehicles) {
                          v.displayDetails();
                      }
                      break;
                  case 5:
                      System.out.println("Thank you for using the Vehicle Rental System!");
                      break;

              }

          } while (number != 5);

          }catch (InputMismatchException e){
            System.out.println("Wrong input");
        }



    }
}