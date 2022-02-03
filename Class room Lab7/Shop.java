public class Shop {
    private Product3[] menu;
    private order1[] orders;
    private int nextOrderInDex;

    public Shop(Product3[] menu)
    {
        this.menu=menu;
        this.orders= new order1[1000];
        nextOrderInDex=0;
    }
    public Product3[] getMenu()
    {
        return menu;
    }
    public void printOrders()
    {
        for(int i=0;i<nextOrderInDex;i++)
        {
            System.out.println("#" + i + " " + orders[i].toString());
    }
    }
    public void placeOrder(int menuItemId,int table)
    {
        Product3 product =menu [menuItemId];
        orders[nextOrderInDex] =new order1(table, product);
        nextOrderInDex++;
    }
    public void completeOrder(int i)
      {
        orders[i].getTable();
      }
      
}
