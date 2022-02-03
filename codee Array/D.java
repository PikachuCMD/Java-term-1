import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            String[] x=sc.nextLine().split(",");
            for(int i=0;i<x.length;i++)
            {
                if(x[i].length()>6)
                {
                    System.out.println(x[i]);
                }
            }
    }
}
