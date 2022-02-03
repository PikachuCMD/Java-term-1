import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        for (int i = 1; i <= (in * in); i++) {
            System.out.print(i + "\t");
            if (i % in == 0) {
                System.out.println();

            }
        }
    }
}
