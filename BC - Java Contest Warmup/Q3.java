import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        for (int i = 1; i <= in; i++) {
            System.out.print(i);
            for (int j = 1; j <= i; j++) {
                System.out.print(" ha");
            }
            System.out.println();
        }
    }
}
