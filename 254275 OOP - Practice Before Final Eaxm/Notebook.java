import java.util.Scanner;
class Notebook{
     private String brand;
     private String model;
     private String cpu;
     private int ram;
     private int ssd;
     private int price;

    Notebook(String brand,String model,String cpu,int ram,int ssd,int price)
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
 public static void main(String[] args)
  {
      Notebook mmaxmax = input();
      System.out.println("Brand: " + mmaxmax.getBrand());
      System.out.println("Model: " + mmaxmax.getModel());
      System.out.println("CPU: "+ mmaxmax.getCpu());
      System.out.println("Ram: "+mmaxmax.getRam()+" GB");
      System.out.println("SSD: "+mmaxmax.getSsd()+ " GB");
      System.out.println("Price: " + mmaxmax.getPrice() + " baht");
  }

  private static Notebook input()
  {
      Scanner pp = new Scanner(System.in);
      String brand = pp.nextLine();
      String model = pp.nextLine();
      String cpu = pp.nextLine();
      int ram = Integer.parseInt(pp.nextLine());
      int ssd = Integer.parseInt(pp.nextLine());
      int price = Integer.parseInt(pp.nextLine());
      return new Notebook(brand,model,cpu,ram,ssd,price);
  }
}