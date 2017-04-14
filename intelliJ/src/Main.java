import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner (System.in);
        String response;
        double itemPrice;
        double totalBudget;
        double totalInCart;

        totalInCart = 0;
        itemPrice = 0;

        System.out.println("Enter your total budget");
        totalBudget = stdIn.nextDouble();

        do
        {
            System.out.print("Enter the price of item:");
            itemPrice += stdIn.nextDouble();
            totalInCart += totalInCart + itemPrice;
            System.out.print("Your cart total is $" + totalInCart + ". ");
            System.out.print("Are you still shopping? (y/n):");
            response = stdIn.nextLine();
        } while (response == "y" || response == "Y");

        if (totalBudget < totalInCart)
        {
            System.out.print("You have exceeded your budget, remove items and start over.");
        }
        else
        {
            System.out.print("Shopping complete, you spent $" + totalInCart);
        }
    }
}
