import java.util.Scanner;
class Lab2Task5
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            for(int a=0;a<i;a++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}