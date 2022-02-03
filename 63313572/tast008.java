import java.util.Scanner;
public class tast008 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=60;
        int b=60;
           a/=(x/60);
           b/=y;
        
        //int b=(y/60);
        System.out.print("Total number of seconds: "+(a+b)   );

    }

}
