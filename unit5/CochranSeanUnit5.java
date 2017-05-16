/*****************************************
* CochranSeanUnit5.java
* Sean Cochran 23APR2017
* This assignment with prompt the user for
* a random # and how many times math calculations
* will be made.
*****************************************/
import java.util.Scanner;

public class CochranSeanUnit5
{
    public static void main(String[] args)
    {

        Scanner stdIn = new Scanner(System.in);

        int randInt;      // store the random # generated
        double randDiv;   // store the division value
        double randLog;   // store the log value
        double randsqrt;  // store the square root value
        int randCube;     // store the cubed value
        String maxRandom; // stores user input of maximum number
        String count;     // stores user input of how many #s generated
        int maxRandomInt; // stores the conversion to int
        int countInt;     // stores the conversion to int


        System.out.println("Enter the maximum random number value: ");
        maxRandom = stdIn.nextLine();

        System.out.println("Enter how many random numbers to generate: ");
        count = stdIn.nextLine();

        maxRandomInt = Integer.parseInt(maxRandom);   // string to int conversion
        countInt = Integer.parseInt(count);           // string to int conversion

        System.out.printf("%10s%10s%10s%10s%10s%10s\n", "Round", "Rand #", "Fraction", "x^3", "Sqrt", "Log");   /* header print statement with
        formatting requirements */

        for (int i = 0; i < countInt; i++)  // for loop that will perform each math calculation while iterating to "count" requirement
        {
            randInt = (int) Math.floor(Math.random() * maxRandomInt);
            randDiv = (double)randInt / maxRandomInt;
            randLog = Math.log(randInt);
            randsqrt = Math.sqrt(randInt);
            randCube = (int) Math.pow(randInt, 3);
            System.out.printf("%10d%10d%10f%10f%10f%10d\n", i+1, randInt, randDiv, randLog, randsqrt, randCube);
        }


    } // end main method
} // end class CochranSeanUnit5
