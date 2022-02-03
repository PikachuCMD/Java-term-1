import java.util.Scanner;
public class flot {
       public static void main(String[] args) {
           double x=new Scanner(System.in).nextDouble();
           double y=x*12.14;
           System.out.printf("%.3f\n", y);
           System.out.println(String.format("%.2f",y));
           
       }

}
