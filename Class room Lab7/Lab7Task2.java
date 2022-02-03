public class Lab7Task2 {
    public static void main(String[] args) {
        Product2 tea1 = new Product2("Thai Iced Tea", 35.0);
        Product2 tea2 = new Product2("English Breakfast Tea", 45.0);
        //int tableA = 1;
        int tableB = 2;
        int tableC = 3;
        order order1 = new order(tableB,tea1);
        order order2 = new order(tableC,tea2);
        order order3 = new order(tableC,tea1);
        System.out.println("Order 1 is for table "+ order1.getTable());
        System.out.println("Order 2 is a "+ order1.getProduct().getName());


        if (order2.getTable() == order3.getTable())
        {
          System.out.println("Order 2 & 3 are the same");
        }

        order1.setComplete(true);
        System.out.println("Order status:");
        System.out.println(order1.toString());
        System.out.println(order2.toString());
        System.out.println(order3.toString());
    }

}
