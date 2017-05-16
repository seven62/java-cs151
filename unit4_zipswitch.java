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


print "What is the current hour?"

input time

if (time < 11) {

----- if (time < 10) {

----- print "You should grab a quick snack."

----- }

----- else {

----- print "Get back to work!"

----- }

}

else {

print "Lunchtime. Go get some food!"
}

-------------------------------------

public class Main
{
public static void main(String[] args)
 {
 int msgs; // Indicates number of unread email messages
 msgs = 5;

 while (msgs > 0)
 {
 System.out.println("Click on the next one and you'll have one less email to deal with!");
 msgs++;

 }
 System.out.println("Next!");


 } // End main
} // end class EngineMonitor1
