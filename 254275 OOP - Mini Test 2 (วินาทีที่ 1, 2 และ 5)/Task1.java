import java.util.Scanner;
class Task1 {

    public static void main(String[] args) {
        Aeroplane ap = input();
        System.out.print("The " + ap.getModel() + " has ");
        System.out.print(ap.getEngines() + " engines and ");
        System.out.println(ap.getSeats() + " seats");
    }

    public static Aeroplane input() {
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        int engines = Integer.parseInt(sc.nextLine());
        int seats = Integer.parseInt(sc.nextLine());
        return new Aeroplane(model, engines, seats);
    }
}