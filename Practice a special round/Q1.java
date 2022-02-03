import java.util.Scanner;
class Q1
{
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          String x=sc.nextLine();
          String [] y=x.split(" ");
          int[] z=new int[y.length];
          for(int i=0;i<y.length;i++)
          {
              z[i]=Integer.parseInt(y[i]);
          }
          int max=z[0];
          for(int i=0;i<y.length;i++)
          {
              if(max<z[i])
              {
                  max=z[i];
              }
          }
          System.out.print(max);
      }
}