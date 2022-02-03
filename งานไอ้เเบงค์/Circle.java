class Circle extends Shape{
    private int radius;

    public Circle(String colour, int rad)
    {
        super(colour);
        this.radius = rad;
    }

    public int getRadius()
    {
        return this.radius;
    }

    public double getArea()
    {
        return Math.PI * this.radius * 2;
    }

}