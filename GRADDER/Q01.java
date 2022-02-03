import java.util.Scanner;

import sun.java2d.loops.ScaledBlit;
public class Q01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double y=(365.25*x)/224.70;
        System.out.printf("%.3f\n", y);
    }
}
