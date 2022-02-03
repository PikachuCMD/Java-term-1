import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
     String[] a= new Scanner(System.in).nextLine().split(" ");
      int[] n=new int[a.length];
        
      for(int i=0;i<a.length;i++)
      {
        n[i]=Integer.parseInt(a[i]); 
      }
      for(int i=1;i<=20;i++)
      {
          Boolean con = true;
          for(int f=0;f<n.length;f++)
          {
              if(i==n[f])
              {
               con=false;
           }
         }
          if(con==true){
           System.out.print(i+" ");
          }
      } 
    }
}

    