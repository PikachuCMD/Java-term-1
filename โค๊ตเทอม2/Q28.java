import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        String[] x = new Scanner(System.in).nextLine().split(" ");
        for (int i = 0; i < x.length; i++) {
            if (x[0].equals(x[i])) {
                System.out.print(true);
            } else {
                System.out.print(false);

            }
        }
    }
}
