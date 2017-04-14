/*************************************************************************
 * CochranSeanUnit3.java
 * Sean Cochran - 09APR2017
 * This program will prompt for name and random numbers to perform math functions.
 *************************************************************************/

import java.util.Scanner;

public class CochranSeanUnit3
{
    public static void main( String[] args)
    {
        Scanner stdIn = new Scanner (System.in);

        String userName;            // asks user for name
        Double a;                   // number saved as variable a
        Double b;                   // number saved as variable b
        Double h;                   // number saved as variable c
        Double pi = 3.14159265359;  // variable saved with value of pi

        System.out.println ("What is your name?");
        userName = stdIn.next();
        System.out.println ("Great, thank you " + userName + "! Now pick a number and we'll save it in variable a:");
        a = stdIn.nextDouble();
        System.out.println ("I need another one " + userName + ". Anything you want, and we'll save it in variable b:");
        b = stdIn.nextDouble();
        System.out.println ("One last time " + userName + ". We'll save this last one in variable h:");
        h = stdIn.nextDouble();

        System.out.println (userName + ", with these numbers we are able to make the following calculations:");
        System.out.println ("The area of a trapezoid is" + h  ( a + b ) / 2 + ".");
        System.out.println ("The surface area of a box is" + (2 * ( a*b + a*h + b*h)) +".");
        System.out.println ("The surface area of a sphere with radius 5 is" + 4 * pi (a*a) + ".");
        System.out.println ("The volume of a sphere with radius 10.0 is" + h  ( a + b ) / 2 + ".");
        System.out.println ("The volume of a spherical cap is" + ¶ h2 (3a – h) / 3 ".");
        System.out.println ("The volume of a frustum is" + pi * h ((a2 + ab + b2) / 3 + ".");
        System.out.println ("The volume of a torus with radii 5 and 10.0 is" + (pi * pi)((a + b)(b - a) * 2) / 4 + ".");




    } //end main
} //end class CochranSeanUnit3
