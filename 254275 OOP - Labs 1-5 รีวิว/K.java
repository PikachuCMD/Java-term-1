import java.util.Scanner;

class K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c = new Car(sc.nextLine(), sc.nextInt());
        System.out.println(c.getModel() + " has a speed of " + c.getSpeed() + "km/h");
        if (c.isFast()) {
            System.out.println("It's a supercar!");
        }
    }
}