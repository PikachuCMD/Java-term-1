import java.util.Scanner;
public class F {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=y-x;
        if(z%2==0)
        {
            System.out.print("Even number");
        }
        else{
            System.out.print("Odd number");
        }
    }
}
