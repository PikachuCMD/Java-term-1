import java.util.Scanner;
public class StarbucksShop {
    private static Scanner sc = new Scanner(System.in);
    private String menu;
    private String size;

    public StarbucksShop(String menu,String size)
    {
        this.menu=menu;
        this.size=size;
    }
    public String getMenu()
    {
        return menu;
    }
    public String getSize()
    {
        return size;
    }
    public static void main(String[] args) {
        StarbucksShop d = input();

        System.out.println("Drink name: " + d.getMenu());
        System.out.print("Size: ");
        switch (d.getSize())
        {
            case "short":
                System.out.println("Short"); break;
            case "tall":
                System.out.println("Tall"); break;
            case "grande":
                System.out.println("Grande"); break;
            case "venti":
                System.out.println("Venti"); break;
        }
      
    }    
    public static StarbucksShop input()
    {
        
        String x=sc.nextLine();
        String y=sc.nextLine();
        return new StarbucksShop(x,y);
    }
}