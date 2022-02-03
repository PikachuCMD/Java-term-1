import java.util.Scanner;
public class E {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        if(x>=0)
        {
            System.out.println("Number is positive");
            System.out.println("This statement is always executed");
        }
        else
        {
            System.out.println("Number is not positive");
            System.out.println("This statement is always executed");
        }

    }
}
