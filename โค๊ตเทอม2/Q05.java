import java.util.Scanner;
public class Q05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
         int[] y=new int[x];
         int max =y[0];
         if(x<5)
         {
             for(int i=0;i<x;i++)
             {
                y[i]=sc.nextInt();
                if(max<y[i])
                {
                    max=y[i];
                }
             }
             System.out.println("max :"+max);
         }
         else 
         {
             System.out.print("Max input");
             
         }
        }
    }