import java.util.Scanner;
class MT2cTask5 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        NetworkPrinter np = input();

        System.out.println(np.getFullName() + " has the IP address " + np.getIPAddress());
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