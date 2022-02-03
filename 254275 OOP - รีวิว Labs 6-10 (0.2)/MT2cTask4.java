import java.util.Scanner;
class MT2cTask4 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Printer p1 = input();
        Printer p2 = input();

        if (p1.isColourLaser()) {
            System.out.println(p1.getFullName() + " is a color laser");
        }
        else {
            System.out.println(p1.getFullName() + " is NOT a color laser");
        }

        if (p1.isCheaperThan(p2)) {
            System.out.println(p1.getFullName() + " is cheaper than " + p2.getFullName());
        }
        else {
            System.out.println(p1.getFullName() + " is more expensive than " + p2.getFullName());
        }
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
