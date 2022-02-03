import java.util.Scanner;
public class Q33 {
      public static void main(String[] args) {
          String[] x=new Scanner(System.in).nextLine().split(" ");
          String y="";
          for(int i=0;i<x.length;i++)
          {
              if(!y.contains(x[i]))
              {
                  y+=x[i];
                  if(i<x.length-1)
                  {
                      y +=" ";
                  }
              }
          }
          System.out.print(y);
      }
}
/*String[] parts = new Scanner(System.in).nextLine().split(",");
      String a = parts[0];
      for(int i=0; i < parts.length; i++)
      {
        if(a.contains(parts[i]))
        {
          a = a;
        }
        else
        {
          a = a + "," + parts[i];
        }
      }
      System.out.println(a);*/