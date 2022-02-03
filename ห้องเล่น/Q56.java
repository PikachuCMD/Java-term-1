import java.util.Scanner;

public class Q56 {
    public static void main(String[] args) {
        String[] x = new Scanner(System.in).nextLine().split(" ");
        int y = Integer.parseInt(x[1]);
        String z = "";
        z += x[0].charAt(0);
        for (int i = 1; i < x[0].length(); i++) {
            if (i % y == 0) {
                z += " ";
            }
            z += x[0].charAt(i);
        }
        System.out.println(z);
        String[] s = z.split(" ");
        int f = 0;
        int[] n = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            n[i] = Integer.parseInt(s[i]);
            f += n[i];
        }
        System.out.println(f);
    }
}
