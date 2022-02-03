import java.util.Scanner;
class E{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        System.out.print(x.toLowerCase().replace("email.", ""));
    }
}