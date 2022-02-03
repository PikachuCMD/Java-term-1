import java.util.Scanner;
class MT2cTask2 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Printer p = input();

        System.out.println(p.getFullName());
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