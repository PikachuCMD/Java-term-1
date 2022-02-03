import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line[] = sc.next().split("");
        for (int i = line.length - 1; i >= 0; i--) {
            System.out.println(line[i]);
        }
    }
}
