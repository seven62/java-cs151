/***************************************************
 * Bourbon.java
 * Sean Cochran - 29APR2017
 *
 * Demonstrates a Java class object.
 ***************************************************/

public class Bourbon
{
  private String breed;
    boolean declawed;
    private String name;
    private int age;//in years
    private double weight;//in pounds

    public void setName(String name)
    {
      this.name = name;
    }

    public void setBreed(String newBreed)
    {
      breed = newBreed; //age and weight are unchanged.
    }

    public String getBreed( )
    {
      return breed;
    }

    public void set(String name, int age, double weight)
    {
    //put appropriate code here
    }

}
