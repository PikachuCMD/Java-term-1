import java.util.Scanner;
class A
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        if(x<0)
        {
            System.out.print("negative");
        }
        else if(x==0)
        {
            System.out.print("zero");
        }
        else 
        {
            System.out.print("positive");
        }
    }

}