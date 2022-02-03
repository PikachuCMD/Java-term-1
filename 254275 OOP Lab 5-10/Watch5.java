import java.util.Scanner;
public class Watch5 
{
    private String name;
    private String colour;
    private int price;

    public Watch5(String name, String colour, int price) 
     {
        this.name = name;
        this.colour = colour;
        this.price = price;
     }
    public String getName() 
     {
        return name;
     }
    public String getColour() 
     {
        return colour;
     }
    public int getPrice() 
     {
        return price;
     }
    public boolean isBudget() 
     {
        if (price < 1000) 
        {
            return true;
        }  
        return false;
        
     }
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Smartwatch w = input();

        if (w.isAppleWatch()) 
        {
            System.out.println(w.getName() + " is an Apple Watch");
        }
        else 
        {
            System.out.println("Not an Apple Watch");
        }
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
class Smartwatch extends Watch5
{
     private String operatingSystem;

        public Smartwatch(String name, String colour, int price, String operatingSystem) 
        {
            super(name, colour, price);
            this.operatingSystem = operatingSystem;

        }

        public String getOperatingSystem() 
        {
            return operatingSystem;
        }

        public boolean isAppleWatch() {
            if (operatingSystem.equals("WatchOS")) 
            {
                return true;
            }
            return false;
        }

    }



