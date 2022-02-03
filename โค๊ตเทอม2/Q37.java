import java.util.Scanner;
public class Q37 {
       public static void main(String[] args) {
           String[] x=new Scanner(System.in).nextLine().split("");
           int f=0;
           for(int i=0;i<x.length;i++)
           {
               if(x[i].equalsIgnoreCase("a")||
                  x[i].equalsIgnoreCase("e")||
                  x[i].equalsIgnoreCase("i")||
                  x[i].equalsIgnoreCase("o")||
                  x[i].equalsIgnoreCase("u"))
               {
                   f++;
               }
           }
        System.out.print(f);
        }
}
