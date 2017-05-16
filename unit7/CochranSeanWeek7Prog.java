/*******************************
 * Created by CochranSean on 5/8/17.
 *
 * Week 7 Program
 * *****************************/
import java.util.Scanner;

public class CochranSeanWeek7Prog
{
    public static void main (String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String name;                //Auxiliar ComputerMicrobe name
        String dNACode;             //Auxiliar ComputerMicrobe DNA Code
        ComputerMicrobe a, b, c;    // ComputerMicrobe objects

        System.out.println("Enter name of first ComputerMicrobe");
        name = stdIn.next();
        System.out.println("Enter DNA Code for first ComputerMicrobe");
        dNACode = stdIn.next();
        a = new ComputerMicrobe(name, dNACode);
        System.out.println("Enter name of second ComputerMicrobe");
        name = stdIn.next();
        System.out.println("Enter DNA Code for second ComputerMicrobe");
        dNACode = stdIn.next();
        b = new ComputerMicrobe(name, dNACode);
        System.out.println("Initial set of ComputerMicrobes");
        System.out.println(a);
        System.out.println(b);
        System.out.println("ComputerMicrobe a after mutation");
        a.mutate();
        System.out.println(a);
        System.out.println("ComputerMicrobe b after swap");
        b.swap();
        System.out.println(b);
        System.out.println("ComputerMicrobe c after reproduction of a and b");
        // c = a.reproduce(b);
        //System.out.println(c);
        System.out.println("ComputerMicrobe b after mutation and swap");
        b.mutate().swap();
        System.out.println(b);
        System.out.println("ComputerMicrobe b after invasion of swap a");
        // b.invadedBy(a.swap());
        System.out.println(b);

    } // end main

}
