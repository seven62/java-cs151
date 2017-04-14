/*
chapter 4 exercise:
- prompts the user to enter a sentence
- gives an error if the sentence does not end with a period
 */


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a sentence.");
        String mySentence = keyboard.nextLine();
        if (mySentence.charAt(mySentence.length()-1) == '.')
        {
            System.out.println("Great work formatting your sentence!");
        }
        else
        {
            System.out.println("WRONG!  You need a sentence at the end.");
        }
    }
}
