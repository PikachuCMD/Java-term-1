public class Lab7Task3 {
    public static void main(String[] args) {
        Shop cafe = setupShop();

        cafe.placeOrder(2, 1);
        cafe.placeOrder(3, 4);
        cafe.placeOrder(0, 4);
        cafe.placeOrder(3, 2);
        cafe.completeOrder(0);
        cafe.printOrders();
    }

    private static Shop setupShop() {
        Product3 coffee1 = new Product3("Expresso", 35.0);
        Product3 coffee2 = new Product3("Cappucino", 40.0);
        Product3 coffee3 = new Product3("Mocha", 45.0);
        Product3 tea1 = new Product3("Thai Iced Tea", 40.0);
        Product3 tea2 = new Product3("Iced Green Tea", 45.0);
        Product3[] menu = { coffee1, coffee2, coffee3, tea1, tea2 };
        return new Shop(menu);
    }
}