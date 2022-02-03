import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = { 1, 2, 3, 4, 5, 6, 7 };
        int y = now(x);
        System.out.print(y);
    }

    private static int now(int x[]) {
        int max = x[0];
        for (int i = 0; i < x.length; i++) {
            if (max < x[i]) {
                max = x[i];
            }
        }
        return max;
    }
}
