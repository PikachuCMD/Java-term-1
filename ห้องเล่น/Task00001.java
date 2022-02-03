import java.util.Scanner;

public class Task00001 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String x = sc.next();
    String[] a = x.split("");
    int[] num = new int[x.length()];
    double g = 0;
    for (int i = 0; i < num.length; i++) {
      num[i] = Integer.parseInt(a[i]);
    }
    for (int i = 0; i < num.length; i++) {
      g += num[i] + Math.pow(2, i);

    }
    System.out.print(g);

  }
}