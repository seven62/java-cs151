/********************************************
 - Sean Cochran 11APR2017
 - attempts to authenticate user based on input
 - if unable to auth, program provides guidance
 *********************************************/


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to your company's terminal server! Please enter your user name (first.last): ");
        String userName = keyboard.nextLine();
        System.out.println("Welcome " + userName + ". Have you completed the latest Acceptable Use Policy? (Y/n): ");
        String aup = keyboard.nextLine();
        System.out.println("Please enter the current time (between 0001 - 2400): ");
        int time = keyboard.nextInt();

        if ((aup == "n") && ((time >= 0700) || (time < 2200)))
        {
            System.out.println("ACCESS DENIED - you need to update the AUP.  Please call the helpline for assistance.");
        }
        else if ((aup == "Y") && ((time <= 659) || (time > 2300)))
        {
            System.out.println("ACCESS DENIED - login attempt outside authorized hours.");
        }
        else
        {
            System.out.println("Welcome to the ACME terminal server.  Now get to work!");
        }
    }
}
