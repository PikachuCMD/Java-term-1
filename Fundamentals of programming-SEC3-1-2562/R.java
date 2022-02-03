import java.util.Scanner;
public class R {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();

        if(x>=1000)
        {
            if(y<19)
            {
                System.out.println(x-(x/100)*10);
            }
            else if(y>18 && y<60)
            {
                System.out.println(x-(x/100)*5);
            }
            else
            {
                System.out.println(x-(x/100)*15);
            }

        }
        else
        {
            System.out.print(x);
        }
    }
}
