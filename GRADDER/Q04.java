import java.util.Scanner;


public class Q04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            for(int a=0;a<x;a++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
