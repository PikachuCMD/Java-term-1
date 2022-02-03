import java.util.Scanner;
class Krispykreme2{
    private String branch;
    private String address;
    private String Nameofproduct;
    private int amount;
    Krispykreme2(String branch,String address,String Nameofproduct,int amount)
    {
        this.branch=branch;
        this.address=address;
        this.Nameofproduct=Nameofproduct;
        this.amount=amount;
    }
    String  getBranch()
    {
        return branch;
    }
    String getAddress()
    {
        return address;
    }
    String getNameofproduct()
    {
        return Nameofproduct;
    }
    int getAmount()
    {
        return amount;
    }
    public static void main(String[] args)
    {
      Krispykreme2 daddyjuniorx = input();
      System.out.println("You order is "+daddyjuniorx.getNameofproduct());
      System.out.println("Amount "+daddyjuniorx.getAmount());

    }
    private static Krispykreme2 input()
    {
      Scanner pp = new Scanner(System.in);
      String branch = pp.nextLine();
      String address = pp.nextLine();
      String Nameofproduct = pp.nextLine();
      int amount = Integer.parseInt(pp.nextLine());

      return new Krispykreme2(branch,address,Nameofproduct,amount);
    }
}