import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble() / 100;
        double weight = sc.nextDouble();
        double bmi = weight / Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.print("Underweight");
        } else if (18.5 <= bmi || bmi < 25) {
            System.out.print("Normal");
        } else if (25 <= bmi || bmi < 30) {
            System.out.print("Overweight");
        } else {
            System.out.print("Obese");
        }

    }
}
