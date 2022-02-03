public class Q2 {
  
    
     private int size;
    
     public Bicycle() 
       {
          size = 0;
          ownerName = "Unknown";
        }
    
     public int getSize() 
     {
           size;
     }
    
     public int setSize(int s) 
     {
     size = s;
     }
    
     public boolean isSameSize(String bicycle) 
     {
     return size == bicycle.getSize();
     }
 }