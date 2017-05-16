/***************************************************
 * Scotch.java
 * Sean Cochran - 29APR2017
 *
 * Demonstrates a Java class object.
 ***************************************************/

package scotch;

public class Scotch
{
  private String label;
  private int age;
  private String region;

  public Scotch (String label, int age, String region)
  {
    this.label=label;
    this.age=age;
    this.region=region;
  }

  public void setLabel(String label)
  {
    this.label = label;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public void setRegion(String region)
  {
    this.region = region;
  }

  public String getLabel()
  {
    return this.label;
  }

  public int getAge()
  {
    return this.age;
  }

  public String getRegion()
  {
    return this.region;
  }
}
