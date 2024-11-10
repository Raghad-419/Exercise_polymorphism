public class Bike implements Vehicle{
    private String brand ;
    private int hours ;

    public Bike() {
    }

    public Bike(String brand, int hours) {
        this.brand = brand;
        this.hours = hours;
    }

    @Override
    public double calculateRentalCost() {
        return 10*hours;
    }

    @Override
    public void displayDetails() {
        System.out.print("Bike{ Brand: "+brand);
        System.out.print("' hours Rental Rate: "+hours);
        System.out.print("' Rental Cost: $"+this.calculateRentalCost()+" }\n");
    }


}
