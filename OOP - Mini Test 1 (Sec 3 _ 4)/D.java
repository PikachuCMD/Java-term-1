import java.util.Scanner;
class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      String[] x=sc.nextLine().split(" ");
      int[] y=new int[x.length];
       int z=0;
      for(int i=0;i<x.length;i++)
      {
         y[i]=Integer.parseInt(x[i]);
      }
     
      for(int i=0;i<x.length;i++)
      {
          if(y[i]%2==0)
          {
              z+=y[i];
          }
      }
         System.out.print(z);
    }
}