public class Rectangle extends Shape {
        private int width;
        private int height;
    Rectangle(String color,int width,int height)
    {
        super(color);
        this.width=width;
        this.height=height;
    }
    double getWidth()
    {
        return width;
    }
    double getHeight()
    {
        return height;
    }
    
    public double getArea()
    {
        return width*height;
    }

    void setWidth(int a)
    {
        this.width=a;
    }
    void setHeight(int b)
    {
        this.height=b;
    }
    @Override
    public String toString()
    {
        return "This Rectangle is "+getColor()+" ("+width+", "+height+") ";
    }


    
}
