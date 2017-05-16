/*******************************
 * Created by CochranSean on 5/8/17.
 *
 * Week 7 Program
 * *****************************/

public class ComputerMicrobe
{
    // Variables Defined
    private String name;
    private String dNACode;

    // Default Constructor
    public ComputerMicrobe()
    {
        this.name = "";
        this.dNACode = "";
    }

    // Constructor
    public ComputerMicrobe(String name, String dNACode)
    {
        this.name = name;
        this.dNACode = dNACode;
    }

    // Get / Set Name
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // Get / Set Name
    public String getdNACode()
    {
        return dNACode;
    }

    public void setdNACode(String dNACode)
    {
        this.dNACode = dNACode;
    }

    @Override
    public String toString()
    {
        return "{" + dNACode + "} " + name;
    }

    public ComputerMicrobe mutate()
    {
        if (this.dNACode.length() <= 1)
        {
            this.dNACode = "Z";
            return this;
        }

        this.dNACode = this.dNACode.substring(0, this.dNACode.length() / 2) + "Z" + this.dNACode.substring((this.dNACode.length() / 2) + 1);
        return this;
    }

    public ComputerMicrobe swap()
    {
        if (this.dNACode.length() < 2)
        {
            return this;
        }

        this.dNACode = this.dNACode.charAt(this.dNACode.length() - 1) + dNACode.substring(1, this.dNACode.length() - 1) + this.dNACode.charAt(0);
        return this;
    }
//    public ComputerMicrobe reproduce(ComputerMicrobe newMicro)
//    {
//     String newName = newMicro.getName().charAt(0) + this.getName().charAt(0);
//
//    }


} //end
