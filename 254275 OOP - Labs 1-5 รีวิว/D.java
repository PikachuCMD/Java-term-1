import java.util.Scanner;
class D {
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          String[] x=sc.nextLine().split(" ");
          int[] y=new int[x.length];
          for(int i=0;i<x.length;i++)
          {
              y[i]=Integer.parseInt(x[i]);
          }
          int z=y[0];
          for(int i=0;i<y.length;i++)
          {
              if(z>y[i])
              {
                  z=y[i];
              }
          }
          System.out.print(z);
      }
}
