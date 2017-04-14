/*
chapter 4 exercise:
- prompts the user to enter an int
- demonstrating a switch statement
 */


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int myInt = stdIn.nextInt();
        switch (myInt)
        {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3: case 4:
                System.out.println("C-D");
                break;
            default:
                System.out.println("E-Z");
        } // end switch

    }
}
