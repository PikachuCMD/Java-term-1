import java.util.Scanner;
class Notebook1{
     private String brand;
     private String model;
     private String cpu;
     private int ram;
     private int ssd;
     private int price;

    Notebook1(String brand,String model,String cpu,int ram,int ssd,int price)
    {
       this.brand=brand;
       this.model=model;
       this.cpu=cpu;
       this.ram=ram;
       this.ssd=ssd;
       this.price=price;
    }
     
    String getBrand()
    {
        return brand;
    }
    String getModel()
    {
        return model;
    } 
    String getCpu()
    {
        return cpu;
    }
    int getRam()
    {
        return ram;
    }
    int getSsd()
    {
        return ssd;
    }
    int getPrice()
    {
        return price;
    }
    public String toString()
    {
        return "This is my notebook "+brand+" "+model+" price "+price+" bath";
    }
 public static void main(String[] args)
  {
      Notebook1 mmaxmax = input();
      System.out.println(mmaxmax.toString());

  }

  private static Notebook1 input()
  {
      Scanner pp = new Scanner(System.in);
      String brand = pp.nextLine();
      String model = pp.nextLine();
      String cpu = pp.nextLine();
      int ram = Integer.parseInt(pp.nextLine());
      int ssd = Integer.parseInt(pp.nextLine());
      int price = Integer.parseInt(pp.nextLine());
      return new Notebook1(brand,model,cpu,ram,ssd,price);
  }
}
