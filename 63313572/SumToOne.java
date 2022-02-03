import java.util.Scanner ;
public class card002 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=0;
        for(int i=x;i>=1;i--)
        {
            y+=i;
            if(i!=1)
            {
            System.out.print(i+" + ");
            }
            else 
            {
                
                System.out.print(i);
            }
        }
        System.out.print(" = "+y);
    }
}
