import java.util.Scanner;
public class F {
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          String[] number=new String[100000];
          int a=0;
          while(sc.hasNext())
          {
              number[a]=sc.nextLine();
              a++;
          }
          System.out.print(number[0].charAt(number[0].length()));
      }
}
