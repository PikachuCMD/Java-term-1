import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x<y)
        {
            for(int i=x;i<=y;i+=x)
            {
               
                System.out.println(i);
                
            }
        }
        else 
        {
            {
                for(int i=y;i<=x;i+=y)
                {
                    
                        System.out.println(i);
                        
                   
                }
            }
        }

    }
}
