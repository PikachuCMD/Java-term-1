import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double y=(365.25*x)/224.70;
        System.out.printf("%.2f\n", y);
    }
}
