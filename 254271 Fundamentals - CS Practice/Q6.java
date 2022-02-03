import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           int x=sc.nextInt();
           for(int i=1;i<=x;i++)
           {
               for(int a=1;a<=i;a++)
               {
                   System.out.print(i+" ");
               }
               System.out.println();
           }
    }
}
