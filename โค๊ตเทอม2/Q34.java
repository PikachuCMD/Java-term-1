import java.util.Scanner;
public class Q34 {
    public static void main(String[] args) {
        int x=new Scanner(System.in).nextInt();
        int y=new Scanner(System.in).nextInt();
        if(x<y)
        {
            for(int i=x+1;i<y;i++)
            {
                System.out.print(i);
            }
        }
       else
        {
            for(int i=y+1;i<x;i++)
            {
                System.out.print(i);
            }
        }
    }
}
