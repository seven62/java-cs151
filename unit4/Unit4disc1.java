/********************************************
 - Sean Cochran 15APR2017
 - attempts to authenticate user based on input
 - if unable to auth, program provides guidance
 *********************************************/


import java.util.Scanner;

public class Unit4disc1 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to your company's terminal server! Please enter your user name (first.last): ");
        String userName = keyboard.nextLine();
        System.out.println("Welcome " + userName + ". Have you completed the latest Acceptable Use Policy? (Y/n): ");
        String aup = keyboard.nextLine();
        System.out.println("Please enter the current time (between 0001 - 2400): ");
        String time = keyboard.nextLine();
        int timeInt = Integer.parseInt(time);

        if ((aup == "n") && ((timeInt >= 0700) || (timeInt < 2200)))
        {
            System.out.println("ACCESS DENIED - you need to update the AUP. Please call the helpline for assistance.");
        }
        else if ((aup == "Y") && ((timeInt <= 659) || (timeInt > 2300)))
        {
            System.out.println("ACCESS DENIED - login attempt outside authorized hours.");
        }
        else
        {
            System.out.println("Welcome to the ACME terminal server. Now get to work!");
        }
    }
}
