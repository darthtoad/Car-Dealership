import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {

        Vehicle hatchback = new Vehicle(1994, "Subaru", "Legacy", 170000, 4000);
        Vehicle suv = new Vehicle(2002, "Ford", "Explorer", 100000, 7000);
        Vehicle sedan = new Vehicle(2015, "Toyota", "Camry", 50000, 30000);
        Vehicle truck = new Vehicle(1999, "Ford", "Ranger", 100000, 4000);
        Vehicle crossover = new Vehicle(1998, "Toyota", "Rav-4", 200000, 3500);

        Vehicle[] allVehicles = {hatchback, suv, sedan, truck, crossover};

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("WELCOME TO OUR AWESOME CAR DEALERSHIP! ENTER EITHER: \"ALL VEHICLES\" OR \"SEARCH PRICE\"");

        try {
            String navigationChoice = bufferedReader.readLine();

            if (navigationChoice.equals("ALL VEHICLES")) {
                for (Vehicle thingy : allVehicles) {
                    System.out.println("----------------------");
                    System.out.println(thingy.year);
                    System.out.println(thingy.brand);
                    System.out.println(thingy.model);
                    System.out.println(thingy.miles);
                    System.out.println(thingy.price);
                }
            } else if (navigationChoice.equals("SEARCH PRICE")) {
                System.out.println("What is your maximum budget for a vehicular device?");
                String stringUserMaxBudget = bufferedReader.readLine();
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
            } else {
                System.out.println("Stop being stupid");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}