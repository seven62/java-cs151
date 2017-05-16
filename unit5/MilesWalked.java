public class Chair {

    private String color;    // instance variable for color of the Chair
    private int numberOfLegs; // instance variable to hold the number of legs

    // Accessor Methods

    public String getColor() {   // method to return the current color
        return this.color;
    }
    public int getNumberOfLegs() {    // method to return the current number of legs
        return this.numberOfLegs;
    }

    // Mutator Methods

    public void setColor(String newColor) {   // method to change color
        this.color = newColor;
    }

    public void setNumberOfLegs(int newLegs) {   // method to change # of legs
        this.numberOfLegs = newLegs;
    }

}