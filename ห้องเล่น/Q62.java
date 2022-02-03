import java.util.Scanner;

public class Q62 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, a[][];
        n = sc.nextInt();
        a = new int[n][n];
        String line = "";

        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                if (j == 0 || 0 == i) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                }
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                if (j <= i - 1) {
                    line += a[i][j] + ",";
                } else {
                    line += a[i][j];
                }
            }
        }
        String column = line.replace("11", "1],[1");
        System.out.println("[[" + column + "]]");
    }
}