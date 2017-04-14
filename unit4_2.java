/*chaapter 4 exercise:
- prompts the user to enter a sentence
- gives an error if the sentence does begin with H and end with a period
 */


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a sentence.");
        String mySentence = keyboard.nextLine();
        char lastChar = mySentence.charAt(mySentence.length()-1);
        char firstChar = mySentence.charAt(0);

        if ((lastChar == '.') && (firstChar == 'H'))
        {
            System.out.println("Is correct");
        }
        else
        {
            System.out.println("Is NOT correct");
        }
    }
}
