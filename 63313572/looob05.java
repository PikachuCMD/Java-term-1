import java.util.Scanner;
public class looob05 {
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int x=sc.nextInt();
          int y=sc.nextInt();
          double num=calrect(x,y);
          System.out.println(num);
      }
      private static double calrect(double x1,double y1)
      {
         double z=x1*y1;
         return z;
      }

}