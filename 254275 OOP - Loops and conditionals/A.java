import java.util.Scanner;
class A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double year=(sc.nextDouble()*365.25)/224.70;
        System.out.print(String.format("%.2f", year));
    }
} 