import java.util.Scanner; //
import java.util.Arrays; //

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rows = new int[5];
        String column = "";
        Arrays.sort(rows);
        for (int i = 0; i < rows.length; i++) {
            rows[i] = sc.nextInt();
            column += rows[i];
        }
        String row = "";
        for (int i = 0; i < rows.length; i++) {
            row += rows[i];
        }
        if (column.equals(row)) {
            System.out.print("Y");
        } else {
            System.out.print("N");
        }

    }
}
