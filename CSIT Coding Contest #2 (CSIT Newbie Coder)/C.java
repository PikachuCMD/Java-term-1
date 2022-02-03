import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();

        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=number;j++)
            {
                System.out.print("A");
            }
            for(int n=1;n<=number;n++)
            {
                System.out.print("B");
            }
            System.out.println();
        }
        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=number;j++)
            {
                System.out.print("C");
            }
            for(int n=1;n<=number;n++)
            {
                System.out.print("D");
            }
            System.out.println();
        }


    }
}
