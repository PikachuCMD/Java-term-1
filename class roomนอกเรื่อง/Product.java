public class Product {
      private String a;
      private double b;

      public Product(String a, double b)
      {
          this.a=a;
          this.b=b;
      }
     
      public  String getName()
      {
          return a;
      }
      public double getPrice()
      {
          return b;
      }
      public String toString()
      {
          return "The price of Phone is "+b+" Bath.";
      }
}
