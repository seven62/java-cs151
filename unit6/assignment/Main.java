package cochranWeek6;

/***************************************************
 * Main.java
 * Sean Cochran - 01MAY2017
 *
 * Main file for CochranSeanUnit6
 * Queries user for specs on appliances and provides stats.
 ***************************************************/

import com.sun.org.apache.xpath.internal.operations.Variable;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner stdIn = new Scanner(System.in);

        String totallyStumped = null; // I was unable to complete the last statement.  :(

        // User input below

        System.out.println("What is the name of the appliance?");
        String name = stdIn.nextLine();

        System.out.println("How many buttons does it have?");
        int numberOfButtons = stdIn.nextInt();

        System.out.println("How many watts?");
        Double wattage = stdIn.nextDouble();

        System.out.println("What is the price?");
        Double price = stdIn.nextDouble();

        System.out.println("Is the device portable?");
        Boolean portable = stdIn.nextBoolean();

        HomeAppliance appliance1 = new HomeAppliance(name, numberOfButtons, wattage, price, portable);


        System.out.println("What is the name of the appliance?");
        name = stdIn.nextLine();

        System.out.println("How many buttons does it have?");
        numberOfButtons = stdIn.nextInt();

        System.out.println("How many watts?");
        wattage = stdIn.nextDouble();

        System.out.println("What is the price?");
        price = stdIn.nextDouble();

        System.out.println("Is the device portable?");
        portable = stdIn.nextBoolean();

        HomeAppliance appliance2 = new HomeAppliance(name, numberOfButtons, wattage, price, portable);


        System.out.println("What is the name of the appliance?");
        name = stdIn.nextLine();

        System.out.println("How many buttons does it have?");
        numberOfButtons = stdIn.nextInt();

        System.out.println("How many watts?");
        wattage = stdIn.nextDouble();

        System.out.println("What is the price?");
        price = stdIn.nextDouble();

        System.out.println("Is the device portable?");
        portable = stdIn.nextBoolean();

        HomeAppliance appliance3 = new HomeAppliance(name, numberOfButtons, wattage, price, portable);

        // Output below

        System.out.println("The average wattage of all the appliances is " + (appliance1.getWattage() + appliance2.getWattage() + appliance3.getWattage() / 3));
        System.out.println("The appliance with the minimum number of buttons is " + (Math.min(Math.min(appliance1.getNumberOfButtons(), appliance2.getNumberOfButtons()), appliance3.getNumberOfButtons())));
        System.out.println("The appliance with the maximum number of buttons is " + (Math.max(Math.max(appliance1.getNumberOfButtons(), appliance2.getNumberOfButtons()), appliance3.getNumberOfButtons())));

        Double maxPrice = Math.max(Math.max(appliance1.getPrice(), appliance2.getPrice()), appliance3.getPrice());
        Boolean isPortable = Boolean.getBoolean(String.valueOf(true));
        System.out.println("The name of the appliance that is portable and it has the largest price is " + totallyStumped + ".");


    }
}
