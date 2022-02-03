import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        for (int i = 1; i <= in; i++) {
            System.out.print("     " + i);
        }
        System.out.println();
        for (int i = 1; i <= in; i++) {
            System.out.print(i);
            for (int j = 1; j <= in; j++) {
                float value = (float) j / i;
                System.out.print("  " + String.format("%.2f", value));

            }
            System.out.println();
        }
    }
}