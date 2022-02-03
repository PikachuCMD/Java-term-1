import java.util.Scanner;
public class Q08 {
    public static void main(String[] args) {
        int x=new Scanner(System.in).nextInt();
        for(int i=1;i<=x;i++)
        {
            for(int a=1;a<=x;a++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
