import java.util.Scanner;
public class Q03 {
    public static void main(String[] args) {
        int x=new Scanner(System.in).nextInt();
        int y=new Scanner(System.in).nextInt();
        for(int i=0;i<=x;i++)
        {
            if(i% y==0)
            {
                System.out.print(i+" ");
            }
        }
    }

    
}
