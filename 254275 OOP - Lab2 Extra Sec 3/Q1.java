import java.util.Scanner;
public class Q1 {
     public static void main(String[] args) {
         int x=new Scanner(System.in).nextInt();
         String y="";
         for(int i=1;i<=x;i++)
         {
             
             double c=Math.pow(i, 2);
             int v=(int)c;
             y+=v;
             if(i<x)
             {
                 y+=" ";
             }
         }
         System.out.print(y);
     }
}
