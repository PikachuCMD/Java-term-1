import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        if(x.equals("red")||x.equals("blue")||x.equals("green")||x.equals("black")||x.equals("white")||x.equals("yellow"))
        {
            System.out.print("That is a colour");
        }
        else{
            System.out.print("Not a colour");
        }
    }
}
