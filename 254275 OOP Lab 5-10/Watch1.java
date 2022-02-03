import java.util.Scanner;
public class Watch1 {
    private static Scanner sc = new Scanner(System.in);
    private String name;
    private String colour;
    private int price;

        public Watch1(String name,String colour,int price)
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

    public static void main(String[] args) {
        Watch1 w = input();

        System.out.println(w.toString());
    }

    private static Watch1 input() {
        String name = sc.nextLine();
        String colour = sc.nextLine();
        int price = Integer.parseInt(sc.nextLine());
        return new Watch1(name, colour, price);
    }   
}
