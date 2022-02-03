public class Product3 {
    private String name;
    private double price;

    public Product3(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " " + price + " bath";
    }

    public boolean equals(Product3 pricex) {
        if (pricex.getName() == this.name && pricex.getPrice() == this.price)
            return true;
        return false;

    }
}
