import java.util.Scanner;
public class maxNN {
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          String x=sc.nextLine();
          String[] a=x.split(" ");
          int [] b=new int[a.length];
          int max=b[0];
          for(int i=0;i<a.length;i++)
          {
            b[i]=Integer.parseInt(a[i]); 
            if(max<b[i])
            {
                max=b[i];
            }
          }
          System.out.print(max);
      }
}
