import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x%2==0)
        {
            int n=1;
            for(int i=1;i<=x;i++)
            {
                n*=i;
            }
            System.out.print(n/2);
        }
        else
        {
            int n=0;
            for(int i=0;i<=x;i++)
            {
                n+=i;
            }
            System.out.print(n*2);
        }
    }
}
