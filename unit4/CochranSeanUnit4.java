/************************************************************************* 
 * CochranSeanUnit4.java
 * Sean Cochran - 16APR2017
 * This program will prompt user for criteria on museum hours of operation.
 *************************************************************************/

import java.util.Scanner;

public class CochranSeanUnit4
{
    public static void main( String[] args)
    {
        Scanner stdIn = new Scanner(System.in);

        boolean holiday; //create space for holiday
        String day; //create space for day of week
        String doAgain; //create space for repeat prompt

        do
        {
            System.out.println("What day is it today?");
            day = stdIn.next();
            if (day == "Tuesday")
            {
                System.out.println("I'm sorry, the museum is not open today.");
            }

            else
            {
                System.out.println ("Great, thank you!  Is today a holiday (y/n)");
                String holidayAnswer = stdIn.next();
                Boolean answered = false;
                while (answered == false)
                {
                    if (holidayAnswer == "y")
                    {
                        holiday = true;
                        answered = true;
                    }
                    else if (holidayAnswer =="n")
                    {
                        holiday = false;
                        answered = true;
                    }
                    else
                    {
                        System.out.println("INVALID INPUT. Please enter y or n");
                    }
                }
            }

            if (holiday == true) // completely stumped as to why i'm stuck here: "error: variable holiday might not have been initialized"
            {
                if ((day == "Monday") || (day == "Wednesday"))
                {
                    System.out.println("Today the museum opens from 1:00pm to 3:00pm.");
                }
                else if ((day == "Thursday") || (day == "Friday"))
                {
                    System.out.println("Today the museum opens from 11:00am to 4:00pm.");
                }
                else if ((day == "Saturday") || (day == "Sunday"))
                {
                    System.out.println("Today the museum opens from 10:00am to 5:00pm.");
                }
            }
            else
            {
                if ((day == "Monday") || (day == "Wednesday"))
                {
                    System.out.println("Today the museum opens from 12:00pm to 4:00pm.");
                }
                else if ((day == "Thursday") || (day == "Friday"))
                {
                    System.out.println("Today the museum opens from 10:00am to 5:00pm.");
                }
                else if ((day == "Saturday") || (day == "Sunday"))
                {
                    System.out.println("Today the museum opens from 9:00am to 6:00pm.");
                }
            }
            System.out.println("Would you like to run again? (y/n)");
            doAgain = stdIn.next();
        } while (doAgain == "y");
    } //end main
} //end class CochranSeanUnit4
