public class Shop {
    private String name;
    private String location;

    Shop(String name,String location)
   {
       this.name=name;
       this.location=location;
   }    
   public String getName()
   {
       return name;
   }
   public String getLocaton()
   {
       return location;
   } 
   public void setLocation(String e)
   {
       this.location=e;
   }
}
