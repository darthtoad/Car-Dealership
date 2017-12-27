import models.vehicle;

public class App {
    public static void main(String[] args) {

        Vehicle hatchback = new Vehicle();
        hatchback.year = 1994;
        hatchback.brand = "Subaru";
        hatchback.model = "Legacy";
        hatchback.miles = 170000;
        hatchback.price = 4000;

        Vehicle suv = new Vehicle();
        suv.year = 2002;
        suv.brand = "Ford";
        suv.model = "Explorer";
        suv.miles = 100000;
        suv.price = 7000;

        Vehicle sedan = new Vehicle();
        sedan.year = 2015;
        sedan.brand = "Toyota";
        sedan.model = "Camry";
        sedan.miles = 50000;
        sedan.price = 30000;

        Vehicle truck = new Vehicle();
        truck.year = 1999;
        truck.brand = "Ford";
        truck.model = "Ranger";
        truck.miles = 100000;
        truck.price = 4000;

    }
}
