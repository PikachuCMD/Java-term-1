import java.util.Scanner;
public class aa03 {
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
           int [] x=new int [3];  
            int i=0;
         while(i<3) {
          x[i]=sc.nextInt();
          i++;
          }
          for(int a=(i-1);a>=0;a--)
          {
              System.out.println(x[a]);
          }
        }
    }
