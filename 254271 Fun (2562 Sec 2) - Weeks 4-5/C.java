import java.util.Scanner;
import java.util.Arrays;
public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int[] x=new int[3];
         for(int i=0;i<x.length;i++)
         {
             x[i]=sc.nextInt();
         }
         Card(x);
    }
    public static void Card(int[] x)
    {
         Arrays.sort(x);
         for(int i=0;i<x.length;i++)
         {
             System.out.println(x[i]);
         }
    }
}
