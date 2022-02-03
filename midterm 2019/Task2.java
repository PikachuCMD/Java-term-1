import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] x=sc.nextLine().split(",");
        int y=x[0].length();
        String z=x[0];
        for(int i=0;i<x.length;i++)
        {
            if(y>x[i].length())
            {
                z=x[i];
            }
        }
        System.out.print(z);
    }
}
