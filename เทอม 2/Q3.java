import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        String[] x=new String[5];
        for(int i=0;i<x.length;i++)
        {
            String y=new Scanner(System.in).nextLine();
            if(x[i].length()<2)
            {
                System.out.print(x[i]);
            }
        }
    }
}
