import java.util.Scanner;
public class Hotel { 
    private String name;
    private int tr;
    private int tf;
    private String address;
    
    Hotel(String name,int tr,int tf,String address)
    {
        this.name=name;
        this.tr=tr;
        this.tf=tf;
        this.address=address;
    }

      String getName()
      {
          return name;
      }
      int getTotalofroom()
      {
          return tr;
      }
      int getTotaloffloor()
      {
          return tf;
      }
      String getAddress()
      {
          return address;
      }
    public static void main(String[] args)
    {
      Hotel pisitpon = input();
      System.out.print("This hotel name is " +  pisitpon.getName() + " has a ");
      System.out.print( pisitpon.getTotalofroom() + " rooms in this hotel and they have ");
      System.out.println( pisitpon.getTotaloffloor() + " Floors");
      System.out.println("The location of this hotel is in "+ pisitpon.getAddress());
    }
    public static Hotel input()
    {
     Scanner pp = new Scanner(System.in);
     String name = pp.nextLine();
     int tr = Integer.parseInt(pp.nextLine());
     int tf = Integer.parseInt(pp.nextLine());
     String address =  pp.nextLine();
     return new Hotel(name,tr,tf,address);
    }

}

