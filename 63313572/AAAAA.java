import java.util.*;
public class AAAAA {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x<y)
        {
            for(int i=(x+1);i<y;i++)
            {
                System.out.print(i+" ");
            }
        }
        else 
        {
            for(int i=(y+1);i<x;i++)
            {
                System.out.print(i+" ");
            }
        }
    }
    
}
