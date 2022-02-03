import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        double z=(x*y)/100;
        System.out.print(z-x);
    }
}
