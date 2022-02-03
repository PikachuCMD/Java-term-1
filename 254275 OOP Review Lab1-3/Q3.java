import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String[] y=x.split("");
        String z="";
        for(int i=y.length-1;i>=0;i--)
        {
            z+=y[i];
        }
        if(z.equals(x))
        {
            System.out.print(true);
        }
        else
        {
            System.out.print(false);
        }
    }
}
