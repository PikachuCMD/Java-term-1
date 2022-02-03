import java.util.Scanner;
public class Watch {
      private static Scanner sc = new Scanner(System.in);
      private String name;
      private String colour;
      private int price;

    public Watch(String name,String colour,int price)
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
    public static void main(String[] args) {
        Watch w = input();

        System.out.println("Watch name: " + w.getName());
        System.out.println("Colour: " + w.getColour());
        System.out.println("Price: " + w.getPrice() + " baht");
    }

    private static Watch input() {
        String name = sc.nextLine();
        String colour = sc.nextLine();
        int price = Integer.parseInt(sc.nextLine());
        return new Watch(name, colour, price);
}
}
