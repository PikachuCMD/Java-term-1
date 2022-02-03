import java.util.Scanner;
public class Q03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=1;
        for(int i=x;i>0;i--)
        {
            y*=i;   
        }
        System.out.print(y);
    }
}
