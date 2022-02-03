import java.util.Scanner;
class StarbucksShop2 {
private static Scanner sc = new Scanner(System.in);
private String menu;
private String size;
private char container;

    public StarbucksShop2(String menu,String size,char container)
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
    public String getContainerDescription()
    {
        if(container== 's')
        {
            return "Starbucks glass";
        }
        else
        {
              return "Normal glass";
        }
    }
   
    public static void main(String[] args) {
        StarbucksShop2 d = input();

        System.out.println(d.getContainerDescription());
    }

    private static StarbucksShop2 input()
    {
        String menu = sc.nextLine();
        String size = sc.nextLine();
        char container = sc.nextLine().charAt(0);
        return new StarbucksShop2(menu, size, container);
    }
}