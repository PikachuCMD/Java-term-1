import java.util.Scanner;
class MT2cTask1 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Printer p = input();

        System.out.println("Brand: " + p.getBrand());
        System.out.println("Model: " + p.getModel());
        System.out.println("Type: " + p.getType());
        System.out.println("Colour: " + p.isColour());
        System.out.println("Price: " + p.getPrice() + " baht");
    }

    private static Printer input() {
        String brand = sc.nextLine();
        String model = sc.nextLine();
        char type = sc.nextLine().charAt(0);
        boolean colour = sc.nextLine().equalsIgnoreCase("C");
        int price = Integer.parseInt(sc.nextLine());
        return new Printer(brand, model, type, colour, price);
    }
}