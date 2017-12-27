import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Vehicle hatchback = new Vehicle(1994, "Subaru", "Legacy", 170000, 4000);
        Vehicle suv = new Vehicle(2002, "Ford", "Explorer", 100000, 7000);
        Vehicle sedan = new Vehicle(2015, "Toyota", "Camry", 50000, 30000);
        Vehicle truck = new Vehicle(1999, "Ford", "Ranger", 100000, 4000);
        Vehicle crossover = new Vehicle(1998, "Toyota", "Rav-4", 200000, 3500);

        ArrayList<Vehicle> allVehicles = new ArrayList<Vehicle>();

        allVehicles.add(hatchback);
        allVehicles.add(suv);
        allVehicles.add(sedan);
        allVehicles.add(truck);
        allVehicles.add(crossover);

        boolean programRunning = true;

        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("WELCOME TO OUR AWESOME CAR DEALERSHIP! ENTER EITHER: \"ALL VEHICLES\", \"ADD VEHICLE\" OR \"SEARCH PRICE\". \"EXIT\" WILL EXIT.");

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
                } else if (navigationChoice.equals("ADD VEHICLE")) {
                    System.out.println("In which year was your car made?");
                    int userVehicleYear = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("What company made said vehicle?");
                    String userVehicleBrand = bufferedReader.readLine();
                    System.out.println("What model is this vehicle of yours?");
                    String userVehicleModel = bufferedReader.readLine();
                    System.out.println("How many miles has this great vehicle experienced on the road?");
                    int userVehicleMiles = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("How much currency should one expect to pay to acquire this vehicle?");
                    int userVehiclePrice = Integer.parseInt(bufferedReader.readLine());
                    Vehicle userVehicle = new Vehicle(userVehicleYear, userVehicleBrand, userVehicleModel, userVehicleMiles, userVehiclePrice);
                    allVehicles.add(userVehicle);
                    System.out.println("Here are the details for your new vehicle:");
                    System.out.println("Alright, here's your new vehicle:");
                    System.out.println("----------------------");
                    System.out.println(userVehicle.year);
                    System.out.println(userVehicle.brand);
                    System.out.println(userVehicle.model);
                    System.out.println(userVehicle.miles);
                    System.out.println(userVehicle.price);
                } else if (navigationChoice.equals("EXIT")) {
                    System.out.println("Farewell!");
                    programRunning = false;
                } else {
                    System.out.println("Stop being stupid");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}