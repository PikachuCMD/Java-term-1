import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        String x = new Scanner(System.in).nextLine();
        int y = new Scanner(System.in).nextInt();
        if (y > x.length()) {
            System.out.print("ERROR");
        } else {
            System.out.print(x.charAt(y - 1));
        }
    }
}
