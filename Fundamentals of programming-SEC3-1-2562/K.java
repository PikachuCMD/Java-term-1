import java.util.Scanner;
public class K {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=0;
        for(int i=1;i<=x;i++)
        {
            if(i%2==1)
            {
                y+=i;
            }
        }
        System.out.print(y);
    }
}
