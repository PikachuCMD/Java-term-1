import java.util.Scanner;
public class tast0001 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     
     
      double[] temperature = {9, 11.5, 11, 8.5, 7, 9, 8.5} ; 
          
       System.out.println("Temperature: "+  m(temperature));
      }
       private static double m(double[] arrayIn)
       {double result = arrayIn[0];
        for (int i=1;  i < arrayIn.length; i++)
        {
          if (arrayIn[i] > result)
          {
            result = arrayIn[i]; 
          }
        }
          return result;
        }
        }