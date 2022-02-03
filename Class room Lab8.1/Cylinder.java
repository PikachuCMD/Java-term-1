public class Cylinder extends Shape{
    private int area;
    private int height;
    Cylinder(String color,int area,int height)
    {
         super(color);
         this.area=area;
         this.height=height;
    }
    double getWidth()
    {
        return area;
    }
    double getHeight()
    {
        return height;
    }
    public String toString()
    {
        return "This Cylinder is "+getColor()+" ("+area+", "+height+") ";
    }
    public double getArea()
    {
        return 2*Math.PI*area*height;
    }
    
}
