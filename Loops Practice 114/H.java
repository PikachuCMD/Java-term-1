import java.util.*;
public class H {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        String a="+-+";
        String b="| |";
          for (int i=0;i<x;i++)
          {
              System.out.print(a);
              if(i< x-1)
              {
                  System.out.print(" ");
              }
          }
          System.out.println();
          for (int i=0;i<x;i++)
          {
              System.out.print(b);
              if(i< x-1)
              {
                  System.out.print(" ");
              }
          }
          System.out.println();
          for (int i=0;i<x;i++)
          {
              System.out.print(a);
              if(i< x-1)
              {
                  System.out.print(" ");
              }
          }
          System.out.println();
    }
}