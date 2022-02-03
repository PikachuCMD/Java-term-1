import java.util.Scanner;
public class Snowman {
    public static void main(String[] args) {
           int x=new Scanner(System.in).nextInt();
           System.out.print("  ");
        for(int i=1;i<=x;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        System.out.print(" ");
        for(int i=1;i<=x+2;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("  ");
        for(int i=1;i<=x;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        System.out.print(" ");
        for(int i=1;i<=x+2;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<=x+4;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        System.out.print(" ");
        for(int i=1;i<=x+2;i++)
        {
            System.out.print("*");
        }
    }
}