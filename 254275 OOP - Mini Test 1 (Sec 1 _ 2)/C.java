import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++)
        {
             System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<x-2;i++)
        {
            System.out.println("*");
        }
        for(int i=0;i<x;i++)
        {
             System.out.print("*");
        }

    }
}
