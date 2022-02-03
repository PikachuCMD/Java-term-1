public class order{
    private int table;
    private Product2 product;
    private boolean complete;
  
     order(int x, Product2 y)
     {
       this.table = x;
       this.product =y;
  
     }
    public int getTable()
   {
     return table;
   }
    public Product2 getProduct()
    {
    return product;
    }
     public void setproduct(Product2 y)
  {
    this.product = y;
  }
  public boolean isComplete()
  {
    return complete;
  }
  public void setComplete(boolean c)
  {
    this.complete = c;
  }
  public String toString()
  {
    String ch = " ";
    if(this.complete==true)
      ch ="/";
      return product.getName()+ " ["+ ch+ "]";
    }
  
  }
  