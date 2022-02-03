import java.util.Scanner;
public class E {
       public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           String[] x=sc.nextLine().split("");
           int a=0;
           int b=0;
           for(int i=0;i<x.length;i++)
           {
               if(x[i].equals("C"))
            {
                    a++;
               }
               else if(x[i].equals("S"))
               {
                   b++;
               }
           }
           if(a==b)  System.out.print(true);
           else System.out.print(false);

       }
}

