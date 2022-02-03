import java.util.Scanner;
public class ComplexNumber {
    private double real;
    private double img;

    public ComplexNumber(double real,double img)
    {
        this.real=real;
        this.img=img;
    }
    public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2)
    {
        ComplexNumber ss=new ComplexNumber(0, 0);
         ss.real=c1.real+c2.real;
         ss.img=c1.img+c2.img;
         return ss;
    }
   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ComplexNumber c1 = new ComplexNumber(sc.nextDouble(),sc.nextDouble());
        ComplexNumber c2 = new ComplexNumber(sc.nextDouble(),sc.nextDouble());
        ComplexNumber ss = sum(c1, c2);
        System.out.printf("The sum of two complex numbers is "+String.format("%.1f",ss.real)+" + "+String.format("%.1f",ss.img) +"i");
    }
}
