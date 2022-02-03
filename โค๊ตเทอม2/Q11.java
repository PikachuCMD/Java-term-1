import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        String[] x=new Scanner(System.in).nextLine().split(" ");
        for(int i=x.length-1;i>=0;i--)
        {
            System.out.println(x[i]);
        }
    }
}
