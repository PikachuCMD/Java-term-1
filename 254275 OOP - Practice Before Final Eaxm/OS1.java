import java.util.Scanner;
class OS1{
     private String brand;
     private String model;
     private String cpu;
     private int ram;
     private int ssd;
     private int price;
     private String op;

    OS1(String brand,String model,String cpu,int ram,int ssd,int price ,String op)
    {
       this.brand=brand;
       this.model=model;
       this.cpu=cpu;
       this.ram=ram;
       this.ssd=ssd;
       this.price=price;
       this.op=op;
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
    boolean CheckExpensive()
    {
        if(price>=35000)
        {
            return true;
        }
        return false;
    }
    String getOperatingSystem()
    {
        return op;
    }
    public String toString()
    {
        return "This is my notebook "+brand+" "+model+" price "+price+" bath";
    }
    boolean isAppleOs()
    {
        if(op.equalsIgnoreCase("MacOS"))
        {
            return true;
        }
        return false;
    }
 public static void main(String[] args)
  { 
      OS1 natasittttt = input();
      if(natasittttt.isAppleOs())
      {
          System.out.print("That operating system form apple");
      }
      else{
        System.out.print("That operating isn't system form apple");
      }
  }

  private static OS1 input()
  {
    Scanner pp = new Scanner(System.in);
    String brand = pp.nextLine();
    String model = pp.nextLine();
    String cpu = pp.nextLine();
    int ram = Integer.parseInt(pp.nextLine());
    int ssd = Integer.parseInt(pp.nextLine());
    int price = Integer.parseInt(pp.nextLine());
    String op = pp.nextLine();
    return new OS1(brand,model,cpu,ram,ssd,price,op);
  }
}
