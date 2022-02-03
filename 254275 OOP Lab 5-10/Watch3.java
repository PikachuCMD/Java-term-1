import java.util.Scanner;
public class Watch3 {
    private static Scanner sc = new Scanner(System.in);
    private String name;
    private String colour;
    private int price;

        public Watch3(String name,String colour,int price)
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
        Watch3 w = input();
        if (w.isBudget()) 
        {
            System.out.println(w.getName() + " is under 1000 baht");
        }
        else 
        {
            System.out.println(w.getName() + " is too expensive");
        }
    }
    private static Watch3 input() {
        String name = sc.nextLine();
        String colour = sc.nextLine();
        int price = Integer.parseInt(sc.nextLine());
        return new Watch3(name, colour, price);
    }

}
