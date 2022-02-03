import java.util.Scanner;
public class bb01 {
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int x=sc.nextInt();
          int y=sc.nextInt();
          for(int i=1;i<=y;i++)
          {
              for(int a=1;a<=x;a++)
              {
                  System.out.print("*");
              }
              System.out.println();
          }
        }
    }