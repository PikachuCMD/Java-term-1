import java.util.Scanner;

public class equals {
    public static void main(String[] args) {
        String[] x = new Scanner(System.in).nextLine().split(" ");
        int y = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[1].equals(x[i])) {
                y++;
            }
        }
        System.out.print(y);

    }
}