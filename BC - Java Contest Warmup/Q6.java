import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble() / 100;
        double weight = sc.nextDouble();
        double BMI = weight / Math.pow(height, 2);
        System.out.print(String.format("%.2f", (BMI)));

    }
}
