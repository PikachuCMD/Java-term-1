public class Shape {
    private String colour;
    private int width;
    private int num;

    public Shape(String colour) {
        this.colour = colour;
    }

    public String toString() {
        return "This shape is " + colour;
    }

     String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public int getWidth()
    {
        return width;
    }
    int getRadius()
    {
        return num;
    }
 }

    


