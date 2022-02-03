import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        String t;
        String g = "";
        do {
            t = new Scanner(System.in).nextLine();
            if (!t.equalsIgnoreCase("Stop"))
                g += t + " ";
            if (t.equalsIgnoreCase("Stop"))
                break;
        } while (true);
        System.out.print(g);
    }
}
