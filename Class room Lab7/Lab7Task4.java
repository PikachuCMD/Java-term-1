import java.util.Scanner;
class Lab7Task4 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        Shop cafe = setupShop();

        while (true) {
            switch(getAction(scanner)) {
                case 1:
                    cafe.printOrders();
                    break;
                case 2:
                    int table = getTable(scanner);
                    int productIndex = getProductIndex(scanner, cafe.getMenu());
                    cafe.placeOrder(productIndex, table);
                    break;
                case 3:
                    int orderIndex = getOrderIndex(scanner);
                    cafe.completeOrder(orderIndex);
                    break;
            }
        }
    }
       private static Shop setupShop() {
        Product3 coffee1 = new Product3("Expresso", 35.0);
        Product3 coffee2 = new Product3("Cappucino", 40.0);
        Product3 coffee3 = new Product3("Mocha", 45.0);
        Product3 tea1 = new Product3("Thia Iced Tea", 40.0);
        Product3 tea2 = new Product3("Iced Green Tea", 45.0);
        Product3[] menu = {coffee1, coffee2, coffee3, tea1, tea2};
        return new Shop(menu);
      }
      private static int getTable(Scanner scanner)
      {
                System.out.println("Enter table:");
                System.out.print("> ");
                int n=scanner.nextInt();
                return n;
      }
      private static  int getProductIndex(Scanner scanner,Product3[] menu)
      {
          System.out.println("Enter product");
              
          for(int i=0;i<menu.length;i++)
          {
              
              System.out.println((i+1)+" "+menu[i]);
              
          }
          System.out.print("> ");
          int n=scanner.nextInt();
          return n-1;
      }
      private static int getOrderIndex(Scanner scanner)
      {
          System.out.println("Enter Order");
          System.out.print("> ");
          int n=scanner.nextInt();
          return n;
      }

  private static int getAction(Scanner scanner) {
      System.out.println();
      System.out.println("What to do next?");
      System.out.println("1. Print orders");
      System.out.println("2. Place new order");
      System.out.println("3. Complete an order");
      System.out.print("> ");
      int action = scanner.nextInt();
      return action;
  }


}
