/***************************************************
 * Bourbon.java
 * Sean Cochran - 29APR2017
 *
 * Demonstrates a Java class object.
 ***************************************************/

package scotch;

public class Main
{
    public static void main(String[] args)
    {
    Scotch dram = new Scotch("Lagavulin", 16, "Islay" );
    Scotch dram2 = new Scotch("Balvenie", 12, "Speyside" );

        System.out.println(dram.getLabel());


    }



}