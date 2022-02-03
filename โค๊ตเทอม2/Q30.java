import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        String[] x = new Scanner(System.in).nextLine().split(" ");
        for (int i = 0; i < x.length; i++) {
            if (x[i].length() >= 7) {
                System.out.print(x);
            }
        }
    }
}
