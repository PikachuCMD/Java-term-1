import java.util.Scanner;
public class A
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=(x*365.25)/224.70;
        System.out.print(String.format("%.2f", y));
    }
}