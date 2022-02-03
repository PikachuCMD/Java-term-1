class Shape {
	private String color = "undefined";
	//private double a=0;
	Shape(String color)
	{
		this.color = color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
	//@Override
 	public double getArea()
	 {
 		return 0;
 	}	 
 	public String toString()
	 {
 		return "This Shape is "+this.color ;
 	}
}