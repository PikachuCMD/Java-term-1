import java.util.Scanner;
public class C {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            
            String x=sc.nextLine();
            String []z=x.split(",");
            String y="";
            for(int i=z.length-1;i>=0;i--)
            {
                 y+=z[i];
                 if(i>0)
                 {
                     y+=",";
                 }
            }
        if(x.equals(y))
        {
            System.out.print(true);
        }
        else
        {
            System.out.print(false);
        }
    }
}
