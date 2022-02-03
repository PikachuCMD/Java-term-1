import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();

        int i = 1;
        while (1 < x) {

            i = i * 2;

            x = x - 1;
        }
        System.out.print(i);
    }
}
