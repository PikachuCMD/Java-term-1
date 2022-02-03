import java.util.Scanner;

public class Q55 {
     public static void main(String[] args) {
          int x = new Scanner(System.in).nextInt();
          int y = 1;
          for (int i = x; i > 0; i--) {
               y *= i;
          }
          System.out.print(y);
     }
}
