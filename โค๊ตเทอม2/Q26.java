import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[4];
        for (int i = 0; i < 4; i++) {
            x[i] = sc.nextInt();
        }
        int max = x[0];
        int min = x[0];
        for (int i = 0; i < x.length; i++) {
            if (max < x[i]) {
                max = x[i];
            }
            if (min > x[i]) {
                min = x[i];
            }
        }
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }
}
