import java.util.Scanner;
class A
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=x;i>0;i--)
        {
            System.out.print(i+" ");
        }
        System.out.print("GO");
    }
}