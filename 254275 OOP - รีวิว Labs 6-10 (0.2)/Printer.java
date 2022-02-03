public class Printer {
     private String brand;
     private String model;
     private char type;
     private boolean colour;
     private int price;

     public Printer(String brand,String model,char type,Boolean colour,int price)
     {
         this.brand=brand;
         this.model=model;
         this.type=type;
         this.colour=colour;
         this.price=price;
        
     }
     public String getBrand()
     {
         return brand;
     }
     public String getModel()
     {
         return model;
     }
     public char getType()
     {
         return type;
     }
     public boolean isColour()
     {
         return colour;
     }
     public int getPrice()
     {
         return price;
     }
     public String getFullName()
     {
         return brand+" "+model;
     }
     public String getTypeDescription()
     {
         if(type == 'i')
         {
             return "inkjet";
         }
         else if(type =='l')
         {
             return "laser";
         }
         else
         {
             return "thermal";
         }
     }
     public boolean isColourLaser() {
        if (type == 'l') {
            return true;
        } else {
            return false;
        }
    }

    public boolean isCheaperThan(Printer p2) {
        if (price < p2.price) {
            return true;
        }
        return false;
    }
   
}