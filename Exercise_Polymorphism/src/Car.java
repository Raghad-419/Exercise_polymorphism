public class Car implements Vehicle {
    private String model;
    private int days;

    public Car() {
    }

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {
        return 50 * days;
    }

    @Override
    public void displayDetails() {
        System.out.print("Car{ Model: " + model);
        System.out.print("' Daily Rental Rate: " + days);
        System.out.print("' Rental Cost: $" + this.calculateRentalCost() + "}\n");

    }


}