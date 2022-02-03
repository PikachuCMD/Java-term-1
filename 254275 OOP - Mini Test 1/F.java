import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line[] = sc.next().split("");
        for (int i = 0; i < line.length; i++) {
            if (line[i].contains("x")) {
                System.out.print(i);
            }

        }
    }
}
