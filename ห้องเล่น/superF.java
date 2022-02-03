import java.util.Scanner;

public class superF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int y = 0;
            String z = "Where is ";
            String t = z.replace("Where is ", "");
            System.out.print(t);
            String x = sc.nextLine();

            if (!x.equals("Bye")) {
                (y) = Integer.parseInt(x);

                if (101 <= y && y <= 118) {
                    System.out.println("Floor 1");
                } else if (201 <= y && y <= 218) {
                    System.out.println("Floor 2");
                } else if (301 <= y && y <= 318) {
                    System.out.println("Floor 3");
                } else if (401 <= y && y <= 418) {
                    System.out.println("Floor 4");
                } else if (501 <= y && y <= 518) {
                    System.out.println("Floor 5");
                }

                else {
                    System.out.println("Invalid room");
                }
            }

            else {
                break;
            }
        } while (true);
    }
}
