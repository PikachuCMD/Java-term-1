import java.util.Scanner;

public class Lab3Task3 {
    public static void main(String[] args) {
        String[] x = new Scanner(System.in).nextLine().split(" ");
        int[] y = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            y[i] = Integer.parseInt(x[i]);
        }
        for (int i = 0; i < x.length; i++) {
            if (y[i] < y[x.length - 1]) {
                System.out.print(y[i] + " ");
            }
        }
    }
}
