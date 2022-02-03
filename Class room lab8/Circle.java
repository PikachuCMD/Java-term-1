 class Circle extends Shape{
   // private String colour;
    private int num;
    

    Circle(String colour,int num)
   {
       super(colour);
       this.num=num;
    
   }
   int getRadius()
   {
       return num;
   }
}
