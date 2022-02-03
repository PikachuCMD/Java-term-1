public class order1{
    private int table;
    private Product3 product;
    private boolean complete;
  
     order1(int x, Product3 y){
       this.table = x;
       this.product =y;
  
    }
   public int getTable(){
     return table;
   }
  public Product3 getProduct(){
    return product;
  }
  public void setproduct(Product3 y){
    this.product = y;
  }
  public boolean isComplete(){
    return complete;
  }
  public void setComplete(boolean c){
    this.complete = c;
  }
  public String toString(){
    String ch = " ";
    if(this.complete==true)
      ch ="/";
      return product.getName()+ " ["+ ch+ "]";
    }
  
  }