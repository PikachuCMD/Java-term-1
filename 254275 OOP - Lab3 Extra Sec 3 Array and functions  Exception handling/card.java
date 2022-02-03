import java.util.Scanner;
class card
{
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            for(int i=1;i<=x;i++)
            {
                System.out.print((i*7)+", ");
            }
    }
}
/*import java.util.*;
public class g0 {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	       int multiples=in.nextInt();
	       int y=7;
	        for (int i = 1; i <= multiples; i++) {
	            System.out.print(i*y+", ");
	            
	        }
	    }
	}*/