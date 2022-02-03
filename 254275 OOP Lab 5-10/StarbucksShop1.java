import java.util.Scanner;
class StarbucksShop1{
private static Scanner sc = new Scanner(System.in);
private String menu;
private String size;
private String name;

    public StarbucksShop1(String menu,String size,String name)
    {
        this.menu=menu;
        this.size=size;
        this.name=name;
    }
    public String getMenu()
    {
        return menu;
    }
    public String getSize()
    {
        return size;
    }
    public String getName()
    {
        return name;
    }
    public String toString()
    {
        return "Your "+name+" drink is "+menu +" and your size is "+size;
    }

    public static void main(String[] args)
    {
        StarbucksShop1 d = input();
        System.out.println(d.toString());
    }

    private static StarbucksShop1 input()
    {
        String menu = sc.nextLine();
        String size= sc.nextLine().toLowerCase();
        String name = sc.nextLine();
        return new StarbucksShop1(menu,size,name);
    }
}