import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line[] = sc.nextLine().split(",");

        for (int i = 0; i < line.length; i++) {
            if (line[i].length() >= 6) {
                System.out.println(line[i]);
            }
        }

    }
}
