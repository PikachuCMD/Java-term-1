import java.util.Scanner;
public class Watch2 {

    private static Scanner sc = new Scanner(System.in);
    private String name;
    private String colour;
    private int price;

        public Watch2(String name,String colour,int price)
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
    public static void main(String[] args) {
        Watch2 w = input();

        System.out.print(w.getName() + " is ");
        System.out.println(w.getPriceRange());
    }

    private static Watch2 input() {
        String name = sc.nextLine();
        String colour = sc.nextLine();
        int price = Integer.parseInt(sc.nextLine());
        return new Watch2(name, colour, price);
    }
}
