import java.util.Scanner;
class C {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Drink d = input();

        System.out.println(d.getContainerDescription());
    }

    private static Drink input() {
        String name = sc.nextLine();
        int volumeMl = Integer.parseInt(sc.nextLine());
        char container = sc.nextLine().charAt(0);
        return new Drink(name, volumeMl, container);
    }
}