    import java.util.Scanner;
    public class Hotel3 { 
        private String name;
        private int tr;
        private int tf;
        private String address;        
        Hotel3(String name,int tr,int tf,String address)
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
    
        public static void main(String[] args)
        {
          Hotel3 pisitpon = input();
           if(pisitpon.isBigHotel())
           {
               System.out.println("The hotel "+pisitpon.getName()+" is a is BigHotel");
           }
           else
           {
               System.out.println("The hotel "+pisitpon.getName()+" isn't is a is BigHotel");
           }
        }
        public static Hotel3 input()
        {
         Scanner pp = new Scanner(System.in);
         String name = pp.nextLine();
         int tr = Integer.parseInt(pp.nextLine());
         int tf = Integer.parseInt(pp.nextLine());
         String address =  pp.nextLine();
         return new Hotel3(name,tr,tf,address);
        }
    
    }
    
    