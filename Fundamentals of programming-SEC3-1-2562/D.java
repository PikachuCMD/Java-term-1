import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x<y)
        {
            System.out.print(y);
        }
        else{
            System.out.print(x);
        }

    }
}
