import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String[]y=x.split(",");
        for(int i=0;i<y.length;i++)
        {
            if(y[i].length()>6)
            {
                System.out.print(y[i]);
                break;
            }
        }
    }
}
