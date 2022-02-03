public class NetworkPrinter {
    
        private String brand;
        private String model;
        private char type;
        private boolean colour;
        private int price;
        private String ipAddress;
   
        public NetworkPrinter(String brand,String model,char type,Boolean colour,int price ,String ipAddress)
        
        {
            this.brand=brand;
            this.model=model;
            this.type=type;
            this.colour=colour;
            this.price=price;
            this.ipAddress=ipAddress;
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
        public boolean isColourLaser() 
        {
           if (type == 'l') {
               return true;
           } else {
               return false;
           }
       }
       public String getIPAddress()
    {
        return ipAddress;
    }
         public boolean isNotSameIPAddress(NetworkPrinter np2)
         {
             if(ipAddress.equals(np2.ipAddress))
             {
                 return false;
             }
             else 
             {
                 return true;
             }
         }
    }
   
       

