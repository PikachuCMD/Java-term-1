import java.util.Scanner;
public class Answer{
    public static void main(String[] args) {
     int a2 = new Scanner(System.in).nextInt();
     String a2Str = a2+"" ;
     int sum = 0;
    for (int i = 0; i < a2Str.length(); i++) {
      int base = a2 % 10;
      a2 = a2 / 10;
      int pow = (int) Math.pow(2, i);
      System.out.println(base + " x " + pow + " = " + (base * pow));
      sum += base * pow;
      
     }
     System.out.println("Answer is " + sum);
    }
   }