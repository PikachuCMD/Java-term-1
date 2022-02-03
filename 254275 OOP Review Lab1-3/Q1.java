import java.text.Format;
import java.util.Scanner;
class Q1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float x=sc.nextFloat();
        float y=sc.nextFloat();
        float z=x*y;
        System.out.printf(x+" * "+y+" = "+z);
    }
}