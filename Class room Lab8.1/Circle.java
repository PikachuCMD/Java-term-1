public class Circle extends Shape{
    private int radius;
    
    public Circle(String color , int radius)
    {
        super(color);
        this.radius=radius;
    }
    public void setRadius(int c)
    {
		    this.radius = c;
	  }
	  public double getRadius()
    {
	    	return radius;
    }
    @Override
    public String toString()
    {
       return "This Cricle is "+getColor() +" ("+radius+") ";
    }    
    public double getArea()
    {
       return Math.PI*(radius*radius);
    }
}

