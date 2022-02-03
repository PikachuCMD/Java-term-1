public class Lab3Task5
{
  public static void main(String[] args)
  {
      int[] x = {5, 9, 12, 7, 14, 3, 2};
      int [] y = arrayPlus(x, 5);
      for (int i = 0; i < y.length; i++)
      {
          System.out.print(y[i] + ", ");
      }
      System.out.println();
      int[] z = arrayPlus(x, 10);
      for (int i = 0; i < z.length; i++)
      {
          System.out.print(z[i] + ", ");
      }
      System.out.println();
  }
   private static  int[] arrayPlus(int[] x, int y)
   {
      int[] z = new int[x.length];
      for(int i = 0; i<x.length; i++){
        z[i] = x[i]+y;
      }
       return z;
   }
}