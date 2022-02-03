import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        String[] x = new Scanner(System.in).nextLine().split("");
        int a = 0;
        int b = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i].equals("C")) {
                a++;
            } else if (x[i].equals("S")) {
                b++;
            }
        }
        if (a == b)
            System.out.print(true);
        else
            System.out.print(false);

    }
}
