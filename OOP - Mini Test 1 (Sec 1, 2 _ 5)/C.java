import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=0;
        for(int i=0;i<5;i++)
        {
            double c=sc.nextDouble();
            n+=c;
        }
        double x=n/5;
        System.out.printf(String.format("%.1f", x));
    }
}
