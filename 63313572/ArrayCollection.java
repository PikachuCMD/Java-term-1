public class ArrayCollection
{
     Object [] elementData;
     int size;
   
    
     public ArrayCollection(int n)
  {
       elementData = new Object[n];
       size = 0;
  }
     public int size()
   {
       return size;
   }
     public void add(Object d)
     {
        elementData[size]= d;
        size++;
         
     }
    
}

