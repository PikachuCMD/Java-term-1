import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        for(int i=a;i>0;i--)
        {
            for(int j=1;j<=a;j++)
            {
               
                if(b == j && c == i)
                {
                    System.out.print("X");
                }
                else
                {
                   System.out.print(".");
                }                           
            }
            System.out.println();
        }
    }
}
