import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String[]y=x.split("");
        String z="";
        for(int i=0;i<y.length;i++)
        {
            if(!z.contains(y[i]))
            {
                z+=y[i];
                if(i<y.length-1)
                {
                    z+=",";
                }
            }
        }
        System.out.println(z);
    }
}
