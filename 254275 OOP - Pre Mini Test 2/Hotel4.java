import java.util.Scanner;
public class Hotel4 {
    private String name;
    private int tr;
    private int tf;
    private String address;  
    private int addroom;     
    Hotel4(String name,int tr,int tf,String address)
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
      boolean isBigHotel()
      {
          if(tr>=300)
          {
              return true;
          }
          else
          {
              return false;
          }
      }
      
      int addRoom(int addroom)
      {
          tr=tr+addroom;
          return tr;
      }
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String name = kb.nextLine();
        int tr = Integer.parseInt(kb.nextLine());
        int tf = Integer.parseInt(kb.nextLine());
        String address =  kb.nextLine();
        int addroom = Integer.parseInt(kb.nextLine());
        Hotel4 dunromch = new Hotel4(name,tr,tf,address);
        dunromch.addRoom(addroom);
        System.out.println("The hotel has built "+addroom+" additional rooms");
        System.out.println("At this time the hotel "+dunromch.getName()+" has a total number of "+dunromch.getTotalofroom()+" rooms");
  }
}

