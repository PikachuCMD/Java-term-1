import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {
      String word, reverse = "";
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter a string to check palindrome : ");
      word = scan.next();

      int length = word.length();

      for (int i = length - 1; i >= 0; i--) {
         reverse = reverse + word.charAt(i);
      }

      if (word.equals(reverse)) {
         System.out.println(word + " is a palindrome.");
      } else { 
         System.out.println(word + " is not a palindrome.");
      }
   }
}