import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String[]y=x.split(" ");
        int[] z=new int[y.length];
        String a="";
        for(int i=0;i<y.length;i++)
        {
            z[i]=Integer.parseInt(y[i]);
        }
        for(int i=0;i<z.length;i++)
        {
            if(z[i]<z[z.length-1])
            {
                a+=z[i];
                if(i<z.length-1)
                {
                    a+=" ";
                }
            }
        }
        System.out.print(a);

    }
}
