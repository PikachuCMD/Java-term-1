.import java.util.Scanner;

public class Q57 {
    public static void main(String[] args) {
        String[] x = new Scanner(System.in).nextLine().split(" ");
        int[] y = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            y[i] = Integer.parseInt(x[i]);
        }
        double a = Math.pow(y[0], y[1]);
        int b = (int) a;
        System.out.println(b);
        String c = String.valueOf(b);
        for (int i = 0; i < y[2]; i++) {
            if (c.length() - y[2] == 1) {
                System.out.print(c.charAt(i));
            } else {
                System.out.print(c.charAt(i + 1));
            }
        }
    }
}
