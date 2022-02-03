import java.util.Scanner;
public class Tastt01 {
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int [] x=new int[1000];
            int n;
          int i=0;
     
          do{
              n=sc.nextInt();
              x[i]=n;
              i++;
          }     while(n>=0);
          for(int a=0;a<x.length;a++)
          {
              if(a<(x.length/2))
              {
                  System.out.println(x[a]+" - "+x[x.length-a] );
                  
              }
          }
          for(int s=0;s<x.length;s++)
          {
              if(s==(x.length/2))
              {
                  System.out.println(x[s]);
              }
          }

      }
}
