class Q1
{
     public static void main (String[] args) 
      {
          double [] marks = { 2.0, 5.0, 3.0, 4.0 }; 
	  double average = averageMark(marks); 
	 System.out.println(average); 
      }
      public static double averageMark(double a[])
      {
          double x=0;
          for(int i=0;i<a.length;i++)
          {
              x+=a[i];

          }
          return x/a.length;
      }
}
 