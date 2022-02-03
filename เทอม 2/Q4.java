import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        int x=new Scanner(System.in).nextInt();
        double y=(365.25*x)/224.70;
        System.out.printf("%.3f\n", y);
    }
}
