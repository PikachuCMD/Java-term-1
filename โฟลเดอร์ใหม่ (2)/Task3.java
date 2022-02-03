import java.util.Scanner;
public class Task3
{

    public static void main(String[] args)
    {
      Krispykreme daddyjuniorx = input();
    //  System.out.println("You order is "+daddyjuniorx.getNameofproduct());
      System.out.println("Amount "+daddyjuniorx.getAmount());

    }
    private static Krispykreme input()
    {
      Scanner pp = new Scanner(System.in);
      String branch = pp.nextLine();
      String address = pp.nextLine();
      String Nameofproduct = pp.nextLine();
      int amount = Integer.parseInt(pp.nextLine());

      return new Krispykreme(branch,address,Nameofproduct,amount);
    }
}