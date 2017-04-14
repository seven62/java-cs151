/*chapter 4 exercise:
- prompts the user to enter an int
- demonstrating a while loop
 */


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int sum = 0; //sum of user-entered values
        int x;
        System.out.print("Enter and integer (-99 to quit):");
        x = stdIn.nextInt();
        while (x != -99)
        {
            sum += x;
            System.out.print("Enter and integer (-99 to quit):");
            x = stdIn.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}

