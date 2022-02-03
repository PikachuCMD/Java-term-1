import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line[] = sc.nextLine().split(",");
        int column[] = new int[line.length];

        for (int i = 0; i < line.length; i++) {
            {
                column[i] = Integer.parseInt(line[i]);
            }
        }
        String tool = "";
        for (int i = 0; i < column.length; i++) {
            if (column[i] % 2 == 0) {
                tool += column[i];
                if (i < column.length - 1) {
                    tool += ",";
                } else {
                    tool += (column[i] - 1);
                    if (i < column.length - 1) {
                        tool += ",";
                    }
                }
            }
        }
        System.out.print(tool);

    }
}
