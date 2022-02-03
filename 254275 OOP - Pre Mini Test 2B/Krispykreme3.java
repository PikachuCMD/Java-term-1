import java.util.Scanner;
class Krispykreme3{
    private String branch;
    private String address;
    private String Nameofproduct;
    private int amount;
    Krispykreme3(String branch,String address,String Nameofproduct,int amount)
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
    int Calacute(int p)
    {
        return amount*p;
    }

public static void main(String[] args)
 {
      Scanner pp = new Scanner(System.in);
      String branch = pp.nextLine();
      String address = pp.nextLine();
      String Nameofproduct = pp.nextLine();
      int amount = Integer.parseInt(pp.nextLine());
      int price = Integer.parseInt(pp.nextLine());
      Krispykreme3 bbasjtr = new Krispykreme3(branch,address,Nameofproduct,amount);
      System.out.println("Total price is "+bbasjtr.Calacute(price)+" bath");
  }
}
