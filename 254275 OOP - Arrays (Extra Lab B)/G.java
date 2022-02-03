import java.util.Scanner;
import java.util.Arrays;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = "";
        String column = "";
        while (sc.hasNext()) {
            String number = sc.nextLine();
            line += number + "0";
            column += number + "0";
        }

        String col = column.replace(",", "0");
        String aa[] = col.split("0");

        int max = Integer.parseInt(aa[0]);

        for (int i = 0; i < aa.length; i++) {
            if (max < Integer.parseInt(aa[i])) {
                max = Integer.parseInt(aa[i]);
            }
        }

        String row[] = line.split("0");
        int[] rowCount = new int[row.length];

        String num1 = "";
        String num2 = "";

        for (int i = 0; i < row.length; i++) {
            num1 += row[i].charAt(0);
            num2 += row[i].charAt(2);
        }

        String[] numm1 = num1.split("");
        String[] numm2 = num2.split("");

        int number1[] = new int[max];
        int number2[] = new int[max];
        for (int i = 0; i < (numm1.length); i++) {
            number1[i] = Integer.parseInt(numm1[i]);
            number2[i] = Integer.parseInt(numm2[i]);
        }
        
        for (int i = 0; i < numm1.length; i++) {
            System.out.println(number2[i]);
        }

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == number2[i - 1] && j == number1[i - 1]) {
                    System.out.print("X");
                } else {
                    System.out.print(".");
                }
                // System.out.print(number1[i-1] +" "+number2[i]+"|");
            }
            System.out.println();
        }

    }
}
