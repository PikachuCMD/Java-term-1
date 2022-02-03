import java.util.Scanner;
public class Jambajuice1 {
    private String branch;
    private String address;
    private int amount;
    private String Nameofproduct;
    private String Store;

    Jambajuice1(String branch,String address,String Nameofproduct,int amount,String Store)
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
    boolean checkStore()
    {
        if(getStore().equalsIgnoreCase("Jambajuice"))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
          Jambajuice1 folktagram = input();
          if(folktagram.checkStore()==true)
          {
            System.out.println(folktagram.getStore()+" is a subsidiary of Krispy Kreme");
          }
          else
          {
            System.out.println(folktagram.getStore()+" isn't a subsidiary of Krispy Kreme");
          }
    }
      public static Jambajuice1 input()
      {
          Scanner pp = new Scanner(System.in);
          String branch = pp.nextLine();
          String address = pp.nextLine();
          String Nameofproduct = pp.nextLine();
          int amount = Integer.parseInt(pp.nextLine());
          String Store = pp.nextLine();
          return new Jambajuice1(branch,address,Nameofproduct,amount,Store);
      }
}
