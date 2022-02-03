import java.util.Scanner;
import java.util.Arrays;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String[] y=x.split(",");
        Arrays.sort(y);
        for(int i=0;i<y.length;i++)
        {
            if(i<y.length-1)
            {
              System.out.print(y[i] +",");
            }
            else
            {
              System.out.print(y[i]);
            }
        }
    }
    
}
