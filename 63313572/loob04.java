import java.util.Scanner;
public class loob04 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double num=Area(x);
        System.out.println("calarea ="+num);
    }
     public static double Area(double a) 
          {
         double pi=3.14;
         double z=a*a*pi;
         return z;
         
          }
    
    
}