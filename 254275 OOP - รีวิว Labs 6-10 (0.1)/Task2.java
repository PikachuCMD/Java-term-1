import java.util.Scanner;
class Task2 {

    public static void main(String[] args) {
        Aeroplane ap = input();
        System.out.println(ap.toString());
    }

    public static Aeroplane input() {
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        int engines = Integer.parseInt(sc.nextLine());
        int seats = Integer.parseInt(sc.nextLine());
        return new Aeroplane(model, engines, seats);
    }
}