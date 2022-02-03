import java.util.Scanner;
public class J {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x=0;
        
        for(int i=a;i<1000;i+=b)
        {
            System.out.println(i);
            x++;
         if(x==c)
        {
            break;
        }

        }
    }
}
