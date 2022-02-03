import java.util.Scanner;
class Task3 {

    public static void main(String[] args) {
        Aeroplane ap = input();
        if (ap.isJumbo()) {
            System.out.println(ap.getModel() + " is a jumbo jet");
        } else {
            System.out.println(ap.getModel() + " is not a jumbo jet");
        }
    }

    public static Aeroplane input() {
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        int engines = Integer.parseInt(sc.nextLine());
        int seats = Integer.parseInt(sc.nextLine());
        return new Aeroplane(model, engines, seats);
    }