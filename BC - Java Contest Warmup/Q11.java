import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names = sc.nextLine();
        int in = sc.nextInt();
        double kg = sc.nextDouble();
        System.out.print(names + " (" + in + " years, " + String.format("%.2f", kg) + "kg)");
    }
}
