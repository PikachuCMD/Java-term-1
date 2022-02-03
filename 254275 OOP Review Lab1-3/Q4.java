import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String[] y=x.split(" ");
        if(y[0].equalsIgnoreCase(y[1]))
        {
            System.out.print("Same");
        }
       else
       {
           System.out.print("Different");
       }
    }
}
