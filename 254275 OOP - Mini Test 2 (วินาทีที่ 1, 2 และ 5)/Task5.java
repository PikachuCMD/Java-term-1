import java.util.Scanner;
class Task5 {

    public static void main(String[] args) {
        Fighter f = input();
        System.out.print("The " + f.getModel());
        if (f.canCarry(2000)) {
            System.out.println(" can carry weapons of 2,000 kg");
        } else {
            System.out.println(" cannot carry weapons of 2,000 kg");
        }
    }

    public static Fighter input() {
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        int engines = Integer.parseInt(sc.nextLine());
        int seats = Integer.parseInt(sc.nextLine());
        int weaponsWeight = Integer.parseInt(sc.nextLine());
        return new Fighter(model, engines, seats, weaponsWeight);
    }
}