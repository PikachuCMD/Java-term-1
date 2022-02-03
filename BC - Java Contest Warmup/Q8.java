import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble() / 100;
        int weight1 = sc.nextInt();
        int weight2 = sc.nextInt();
        int width = sc.nextInt();

        for (int i = weight1; i <= weight2; i += width) {
            double bmi = i / Math.pow(height, 2);
            if (bmi < 18.5) {
                System.out.println(i + " " + String.format("%.2f", (bmi)) + " Underweight");
            } else if (18.5 <= bmi && bmi < 25) {
                System.out.println(i + " " + String.format("%.2f", (bmi)) + " Normal");
            } else if (25 <= bmi && bmi < 30) {
                System.out.println(i + " " + String.format("%.2f", (bmi)) + " Overweight");
            } else {
                System.out.println(i + " " + String.format("%.2f", (bmi)) + " Obese");
            }
        }

    }
}
