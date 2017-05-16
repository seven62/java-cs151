/***************************************************
 * Scotch.java
 * Sean Cochran - 29APR2017
 *
 * Demonstrates a Java class object.
 ***************************************************/

package scotch;

public class Main
{
     public static void main(String[] args)
    {
      Scotch dram = new Scotch("Lagavulin", 16, "Islay");

      System.out.println(dram.getLabel());
      System.out.println(dram.getAge());
      System.out.println(dram.getRegion());

      dram.setLabel("Balvenie");
      System.out.println(dram.getLabel());

      dram.setAge(12);
      System.out.println(dram.getAge());

      dram.setRegion("Speyside");
      System.out.println(dram.getRegion());

    }
}
