import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        String x=new Scanner(System.in).nextLine();
        int y=0;
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)==';')
            {
                y++;
            }
        }
        System.out.print(y);
    }
}
