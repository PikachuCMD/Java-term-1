import java.util.Scanner;

class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.nextInt() % 3 == 0) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}