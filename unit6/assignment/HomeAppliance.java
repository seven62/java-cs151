package cochranWeek6;

/***************************************************
 * HomeAppliance.java
 * Sean Cochran - 01MAY2017
 *
 * Driver file for CochranSeanUnit6
 * Queries user for specs on appliances and provides stats.
 ***************************************************/

public class HomeAppliance
{
    // Variables defined
    private String name;
    private int numberOfButtons;
    private Double wattage;
    private Double price;
    private Boolean portable;

    public HomeAppliance (String name, int numberOfButtons, Double wattage, Double price, Boolean portable)
    {
        this.name=name;
        this.numberOfButtons=numberOfButtons;
        this.wattage=wattage;
        this.price=price;
        this.portable=portable;
    }

    // Setters defined

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int numberOfButtons)
    {
        this.numberOfButtons = numberOfButtons;
    }

    public void setWattage(Double wattage)
    {
        this.wattage = wattage;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public void setPortable(Boolean portable)
    {
        this.portable = portable;
    }

    // Getters defined

    public String getName()
    {
        return this.name;
    }

    public int getNumberOfButtons()
    {
        return this.numberOfButtons;
    }

    public Double getWattage()
    {
        return this.wattage;
    }

    public Double getPrice()
    {
        return this.price;
    }

    public Boolean getPortable()
    {
        return this.portable;
    }

} // End HomeAppliance
