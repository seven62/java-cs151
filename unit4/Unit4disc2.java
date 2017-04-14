/**********************
sean cochran - 12APR2017
- unit 4 discussion 2
- loop / switch example
* **********************/


import java.util.Scanner;

public class Unit4disc2
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Please enter which floor of your office building you work on (either 2, 3, 4, or 5): ");
        int myInt = stdIn.nextInt();
        switch (myInt)
        {
            case 2:
                System.out.println("You work in HR and your machine is on the .20 subnet.");
                break;
            case 3:
                System.out.println("You work in Accounting and you're LATE!");
                break;
            case 4: case 5:
            System.out.println("Your office has a pretty nice view from up there.  Don't you have a meeting to be in?");
            break;
            default:
                System.out.println("You're either hanging out in the lobby, or you're in the wrong place!");
        } // end switch
    }
}
