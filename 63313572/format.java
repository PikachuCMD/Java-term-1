import java.util.Scanner;
public class format {
       public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           double a=sc.nextDouble();
           double vat=(0.07*a);
           double sum =(a+vat);
           System.out.print(String.format("%.2f", a)+" baht + VAT = "+String.format("%.2f",sum )+" baht");
       }
}
