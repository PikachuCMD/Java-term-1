
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height1 = sc.nextInt();
        int height2 = sc.nextInt();
        int width1 = sc.nextInt();

        int weight1 = sc.nextInt();
        int weight2 = sc.nextInt();
        int width2 = sc.nextInt();

        for (int i = height1; i <= height2; i += width1) {
            System.out.print("     " + i);
        }
        System.out.println();
        for (int i = weight1; i <= weight2; i += width2) {
            System.out.print(i + "    ");
            for (double j = height1; j <= height2; j += width1) {
                double bmi = i / Math.pow((j / 100), 2);
                if (bmi < 18.5) {
                    System.out.print("Underweight  ");
                } else if (18.5 <= bmi && bmi < 25) {
                    System.out.print("Normal  ");
                } else if (25 <= bmi && bmi < 30) {
                    System.out.print("Overweight  ");
                } else {
                    System.out.print("Obese  ");
                }
            }
            System.out.println();
        }

    }
}
