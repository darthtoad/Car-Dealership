import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your maximum budget for a vehicle?");

        try {
            String stringUserMaxBudget = bufferedReader.readLine();
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

            Vehicle[] allVehicles = {hatchback, suv, sedan, truck};

            int userMaxBudget = Integer.parseInt(stringUserMaxBudget);

            System.out.println("Awesome! Here are the thingies you can afford: ");

            for (Vehicle thingy : allVehicles) {
                if (thingy.worthBuying(userMaxBudget)) {
                    System.out.println("----------------------");
                    System.out.println(thingy.year);
                    System.out.println(thingy.brand);
                    System.out.println(thingy.model);
                    System.out.println(thingy.miles);
                    System.out.println(thingy.price);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}