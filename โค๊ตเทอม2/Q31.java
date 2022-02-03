import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        String[] x = new Scanner(System.in).nextLine().split(" ");
        int[] y = new int[x.length];
        int[] z = new int[y.length];
        for (int i = 0; i < x.length; i++) {
            y[i] = Integer.parseInt(x[i]);
        }
        for (int i = 0; i < x.length; i++) {
            if (y[i] % 2 == 0) {
                z[i] = y[i] - 1;
            } else {
                z[i] = y[i] + 1;
            }
        }
        for (int i = 0; i < x.length; i++) {
            if (i < x.length - 1) {
                System.out.print(z[i] + ",");
            } else {
                System.out.print(z[i]);
            }
        }
    }
}
