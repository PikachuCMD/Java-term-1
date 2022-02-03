import java.util.Scanner;
public class Q {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z= x+y;
        if(z<7)
        {
            System.out.println("Low");
        }
        else{
            System.out.println("High");
        }
    }
}
