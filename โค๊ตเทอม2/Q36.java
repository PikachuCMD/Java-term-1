import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int[] n = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            n[i] = Integer.parseInt(a[i]);
        }
        for (int i = 1; i <= 20; i++) {
            Boolean con = true;
            for (int f = 0; f < n.length; f++) {
                if (i == n[f]) {
                    con = false;
                }
            }
            if (con == true) {
                System.out.print(i + " ");
            }
        }
    }
}
