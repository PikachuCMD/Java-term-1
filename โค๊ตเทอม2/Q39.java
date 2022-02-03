import java.util.Scanner;

public class Q39 {
       public static void main(String[] args) {
              String[] x = new Scanner(System.in).nextLine().split(" ");
              int min = x[0].length();
              int y = 0;
              for (int i = 0; i < x.length; i++) {
                     if (x[i].length() < min) {
                            min = x[i].length();
                            y = i;
                     }
              }
              System.out.print(x[y]);
       }
}
