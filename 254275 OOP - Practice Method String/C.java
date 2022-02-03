import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        int y=sc.nextInt();
        System.out.print(x.substring(y, x.length()));
    }
}