import java.util.Scanner;
public class Hotel2 { 
    private String name;
    private int tr;
    private int tf;
    private String address;
    
    Hotel2(String name,int tr,int tf,String address)
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
     public String toString()
      {
       return name+" Hotel in "+address+".";
      }

    public static void main(String[] args)
    {
      Hotel2 pisitpon = input();
     System.out.print("Welcome To "+pisitpon.toString());
    }
    public static Hotel2 input()
    {
     Scanner pp = new Scanner(System.in);
     String name = pp.nextLine();
     int tr = Integer.parseInt(pp.nextLine());
     int tf = Integer.parseInt(pp.nextLine());
     String address =  pp.nextLine();
     return new Hotel2(name,tr,tf,address);
    }

}

