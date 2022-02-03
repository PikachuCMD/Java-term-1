import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] x=new String[1000];
        int a=0;
        do{
            String y=sc.nextLine();
            if(y.equals("*")) break;
              x[a]=y;
              a++;
        }while(true);
        for(int i=0;i<a;i++)
        {
            if(i==a/2)
            {
                if(a%i==0)
                {
                    System.out.println(x[i-1]);
                }
                System.out.println(x[i]);
            }
        }
    }
}
