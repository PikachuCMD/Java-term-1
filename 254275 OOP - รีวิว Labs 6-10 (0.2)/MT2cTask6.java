import java.util.Scanner;
class MT2cTask6 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        NetworkPrinter np1 = input();
        NetworkPrinter np2 = input();

        System.out.print(np1.getFullName() + " and " + np2.getFullName());
        if (np1.isNotSameIPAddress(np2)) {
            System.out.println(" can be on the same network");
        }
        else {
            System.out.println(" can not be on the same network");
        }
    }

    private static NetworkPrinter input() {
        String brand = sc.nextLine();
        String model = sc.nextLine();
        char type = sc.nextLine().charAt(0);
        boolean colour = sc.nextLine().equalsIgnoreCase("C");
        int price = Integer.parseInt(sc.nextLine());
        String ipAddress = sc.nextLine();
        return new NetworkPrinter(brand, model, type, colour, price, ipAddress);
    }
}