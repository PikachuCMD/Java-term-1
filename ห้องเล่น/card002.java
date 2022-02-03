import java.util.Scanner;

public class card002 {
    public static void main(String[] args) {
        String x = "";
        do {
            String y = new Scanner(System.in).nextLine();
            if (y.equals("stop")) {
                break;
            }
            if (!y.equals("stop")) {
                x += y;
            }
        } while (true);
        System.out.print(x.length());
    }
}
