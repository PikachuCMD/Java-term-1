import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();

        if(x<y)
        {
          int a=(int)Math.floor(x);
          int b=(int)Math.ceil(y);
           String z="";
            for(int i=a+1;i<b;i++)
            {
                z+=i;
                if(i<b-1)
                {
                    z+=" ";
                }
            }
            System.out.print(z);
        }
      else
        {
          int a=(int)Math.floor(y);
          int b=(int)Math.ceil(x);
           String z="";
            for(int i=a+1;i<b;i++)
            {
                z+=i;
                if(i<b-1)
                {
                    z+=" ";
                }
            }
            System.out.print(z);
        }
    }
}
