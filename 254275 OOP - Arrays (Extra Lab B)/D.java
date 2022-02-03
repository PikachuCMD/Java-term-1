import java.util.Scanner;

class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if (line.contains("1,2,3")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}