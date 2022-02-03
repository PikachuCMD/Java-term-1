import java.util.Scanner;
public class Watch4 {
    private static Scanner sc = new Scanner(System.in);
    private String name;
    private String colour;
    private int price;

        public Watch4(String name,String colour,int price)
          {
           this.name=name;
           this.colour=colour;
           this.price=price;
          }
             String  getName()
             {
      return name;
             }
  String getColour()
  {
      return colour;
  }
  int getPrice()
  {
      return price;
  }
   public String toString()
    {
        return name+" "+colour;
    }
     String getPriceRange()
     {
         if(price<1000)
         {
             return "Budget";
         }
         else if(price>10000)
         {
             return "Executive";
         }
         else
         {
             return "Regular";
         }
         }     
          boolean isBudget()
          {
              if(price<1000)
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
        Smartwatch w = input();

        System.out.println("Watch name: " + w.getName());
        System.out.println("Operating System: " + w.getOperatingSystem());
    }

    private static Smartwatch input() 
    {
        String name = sc.nextLine();
        String colour = sc.nextLine();
        int price = Integer.parseInt(sc.nextLine());
        String operatingSystem = sc.nextLine();
        return new Smartwatch(name, colour, price, operatingSystem);
    }
}
class Smartwatch extends Watch4
{
    private String operatingSystem;
    Smartwatch(String name,String colour,int price,String operatingSystem)
    {
        super(name,colour,price);
        this.operatingSystem=operatingSystem;
    }
    public String getOperatingSystem()
    {
        return operatingSystem;
    }
}


