import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=0;
        for(int i=1;i<=x;i++)
        {
            n+=i;
        }
        System.out.print(n);
    }
}
