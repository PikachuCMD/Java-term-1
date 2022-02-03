import java.util.Scanner;
public class N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            if(i%2==0){
            for(int a=0;a<i;a++)
            {
                 System.out.print("*");
            }
            System.out.println();
        }
    }
    }
}
