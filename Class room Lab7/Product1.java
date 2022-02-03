public class Product1 
{    
     private String name;     
      private double price;     
      public Product1(String name, double price) 
      {         
          this.name = name;         
          this.price = price;      
      }      
    public String getName()
      {         
        return name;     
      }      
    public double getPrice() 
      {         
        return price;    
      }      
     public String toString() 
      {        
        return name + " " + price + " bath";    
      }     
     public boolean equals(Product1 pricex) 
      {         
        if (pricex.getName() == this.name && pricex.getPrice() == this.price)
         {
           return true;  
         }     
      return false;     
    
    }
 }

