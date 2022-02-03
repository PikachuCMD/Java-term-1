import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        String[] x=new Scanner(System.in).nextLine().split(" ");
        int [] y=new int[x.length];
        int z=0;
        for(int i=0;i<x.length;i++)
        {
            y[i]=Integer.parseInt(x[i]);
            if(y[i]%3==0)
            {
                z++;
            }
        }
       System.out.print(z);

    }
}
