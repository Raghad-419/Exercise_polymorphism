public class Truck implements Vehicle{
private String type;
private int weeks;

    public Truck(){

    }

    public Truck(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }

    @Override
    public double calculateRentalCost() {
        return 500*weeks;
    }

    @Override
    public void displayDetails() {
        System.out.print("Truck{ Type: "+type);
        System.out.print("' weekly Rental Rate: "+weeks);
        System.out.print("' Rental Cost: $"+this.calculateRentalCost()+" }\n");

    }



}
