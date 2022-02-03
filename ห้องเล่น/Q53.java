import java.util.Scanner;

public class Q53 {
    public static boolean Boolean(String a) {
        int b = 0;
        int s = 0;
        String x = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            x += a.charAt(i);
        }
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                b++;
            } else if (ch == ')' || ch == ']' || ch == '}') {
                s++;
            }
        }
        if (s == b || x.equals(a)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String x = new Scanner(System.in).nextLine();
        boolean n = Boolean(x);
        if (n) {
            System.out.print("correct");
        } else {
            System.out.print("incorrect");
        }
    }
}
