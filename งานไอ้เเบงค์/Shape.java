class Shape{
    private String colour;
    private double area;

    public Shape(String colour)
    {
        this.colour = colour;
    }

    public String toString(){
        return "This shape is " + this.colour;
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public double getArea(){
        return this.area;
    }
}