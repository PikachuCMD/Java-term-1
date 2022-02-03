import java.util.Scanner;
public class hbd
{
    public static void main(String[] args)
    {
        NAnthaphong op = input();
        System.out.println("Happy birthday to " + op.getName()+" You are  Newbie God "  + " now your age is " + op.getAges() + " years old ");
        if (op.isDynasty(5))
        {
            System.out.println("Dynasty of P Soda");
        }
        else
        {
            System.out.println("No");
        }
          System.out.println("God Soda Wish You " +op.toString());
    }
    private  static NAnthaphong input()
    {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int age = Integer.parseInt(in.nextLine());
        int dynasty = Integer.parseInt(in.nextLine());
        return new NAnthaphong(name, age, dynasty);
    }
}