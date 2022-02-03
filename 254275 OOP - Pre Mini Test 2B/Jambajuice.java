import java.util.Scanner;
class Jambajuice{
    private String branch;
    private String address;
    private int amount;
    private String Nameofproduct;
    private String Store;

    Jambajuice(String branch,String address,String Nameofproduct,int amount,String Store)
    {
        this.branch=branch;
        this.address=address;
        this.Nameofproduct=Nameofproduct;
        this.amount=amount;
        this.Store=Store;
    }
    String getBranch()
    {
        return branch;
    }
    String getAddress()
    {
        return address;
    }
    
    String getStore()
    {
        return Store;
    }
    
public static void main(String[] args)
{
      Jambajuice iplann = input();
      System.out.println("Krispykreme Shop "+iplann.getBranch()+" Branch Location "+iplann.getAddress());
      System.out.println("This shop's name "+iplann.getStore());
}

  public static Jambajuice input()
  {
      Scanner pp = new Scanner(System.in);
      String branch = pp.nextLine();
      String address = pp.nextLine();
      String Nameofproduct = pp.nextLine();
      int amount = Integer.parseInt(pp.nextLine());
      String Store = pp.nextLine();
      return new Jambajuice(branch,address,Nameofproduct,amount,Store);
  }
}