import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        String[] x = new Scanner(System.in).nextLine().split(" ");
        for (int i = 0; i < x.length; i++) {
            if (x[0].length() > 6) {
                break;
            } else if (x[i].length() >= 6) {
                System.out.print(x[i]);
            }
        }
    }
}
