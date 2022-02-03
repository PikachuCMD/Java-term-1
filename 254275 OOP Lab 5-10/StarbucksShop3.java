import java.util.Scanner;
class StarbucksShop3 {
private static Scanner sc = new Scanner(System.in);
private String menu;
private String size;
private char container;

    public StarbucksShop3(String menu,String size,char container)
    {
        this.menu=menu;
        this.size=size;
        this.container=container;
    }
    public String getMenu()
    {
        return menu;
    }
    public String getSize()
    {
        return size;
    }
     public boolean isSameName(StarbucksShop3 d2)
     {
         if(d2.menu.equals(menu))
         {
             return true;
         }
         else
         {
            return false;
         }
     }
   
    public static void main(String[] args) {
        StarbucksShop3 d1 = input();
        StarbucksShop3 d2 = input();

        if (d1.isSameName(d2)) {
            System.out.println("Drink 1 and Drink 2 is the same menu");
        }
        else {
            System.out.println("Not the same menu");
        }
    }

    private static StarbucksShop3 input() {
        String menu = sc.nextLine();
        String size = sc.nextLine();
        char container = sc.nextLine().charAt(0);
        return new StarbucksShop3(menu, size, container);
    }
}