/* MiilesWalked.java
 * Sean Cochran - 20APR2017
 * This program will calculate highest number of miles walked in one day.
 *************************************************************************/

import java.util.Scanner;

public class MilesWalked
{
    public static void main( String[] args)
    {
        Scanner stdIn = new Scanner(System.in);

        String input1;  //stores the miles walked yesterday in string
        String input2;  //stores the miles walked today in string
        int milesYesterday;
        int milesToday;


        System.out.println("Enter how many miles you walked 1 day ago: ");
        input1 = stdIn.nextLine();

        System.out.println("Enter how many miles you walk today: ");
        input2 = stdIn.nextLine();

        milesYesterday = Integer.parseInt(input1);
        milesToday = Integer.parseInt(input2);

        System.out.println("The most number of miles you walked in one day was " + (Math.max(milesYesterday, milesToday)) + "!");

    } //end main
} //end class milesWalked
