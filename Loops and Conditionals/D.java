import java.util.Scanner;
public class D {
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
         String x=sc.nextLine();
          String[] y=x.split(" ");
          int[] z=new int[y.length];
          for(int i=0;i<y.length;i++)
          {
              z[i]=Integer.parseInt(y[i]);
          }
        
       
        int min =z[0];
        for(int i=0;i<z.length;i++)
        {
        if(min>z[i])
            {
                min=z[i];
            }
        }
        System.out.println(min);
        
      }
}
