import java.util.Scanner;

public class Q18 {
   public static void main(String[] args) {
      String  reverse = "";
      String word =new Scanner(System.in).next();

      int x = word.length();

      for (int i = x - 1; i >= 0; i--) {
         reverse = reverse + word.charAt(i);
      }

      if (word.equals(reverse)) {
         System.out.println("YES");
      } else { 
         System.out.println("NO");
      }
   }
}