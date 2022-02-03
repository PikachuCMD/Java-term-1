import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (true) {
            input += "," + sc.next();
            if (input.contains("quit"))
                break;
        }

        String[] output = input.split(",");
        for (int i = 0; i < output.length; i++) {
            if (output[i].length() < 8 && output[i].equals("quit")) {
                System.out.println(output[i]);
            }
        }
    }
}
