import java.util.Scanner;
public class Lab3Task2A {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Number of assessments: ");
         int s=sc.nextInt();
         float  average=0;
         float[] n=new float[s];       
         for(int i=0;i<s;i++)
         {
             System.out.print("Mark for assessment " + (i+1) + ": ");
             n[i]=sc.nextFloat();
             average+=n[i];
         }
         average= average/s;
          System.out.println("Your average mark is: " + average);
          
     }    
    
}

