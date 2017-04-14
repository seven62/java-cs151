/*chapter 4 exercise:
- prompts the user to enter an int
- demonstrating a switch statement
 */


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Pleas enter a zip code:");
        String myZip = stdIn.nextLine();
        System.out.println(myZip.charAt(0));
        switch (myZip)
        {
            case "Sean": case '2': case '3':
                System.out.println("East");
                break;
            case '4': case '5': case '6':
                System.out.println("Central");
                break;
            case '7':
                System.out.println("West");
                break;
            default:
                System.out.println("E-Z");
        } // end switch

    }
}
