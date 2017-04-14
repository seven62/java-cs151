/**
 * budget.java
 * Sean Cochran
 * This program will calculate yearly savings based on input from the user
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
    Scanner stdln = new Scanner(System.in);

    double annualIncome; // Total income earned in one year.
    double monthlyPercentage; // The percentage of monthly income to send to savings.
    double yearlySavings; // Total amount that will be saved in one year.
    double monthlySavings; // Total amount that will be saved in one year.

    System.out.print("How much money do you take home in a year?");
    annualIncome = stdln.nextDouble();

    System.out.print("Enter the percentage of monthly income do you want to save in decimal (example: .10 for 10%)");
    monthlyPercentage = stdln.nextDouble();

    monthlySavings = (annualIncome / 12) * monthlyPercentage;
    System.out.print("You will save $" + Double.toString(monthlySavings) + " per month.");

    yearlySavings = monthlySavings * 12;
    System.out.print("  This will total $" + Double.toString(yearlySavings) + " over the course of one year.  Great job!");
    }
}
