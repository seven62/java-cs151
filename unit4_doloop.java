/*capter 4 exercise:
- demonstrating a while loop
 */


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);

        for (int i = 10; i > 0; i--)
        {
            System.out.print(i + " ");
        }
        System.out.println("Liftoff!");
    }
}


do - evaluated at the end of the loop
while - condition is continually evaluated
for - task completed "x" times
