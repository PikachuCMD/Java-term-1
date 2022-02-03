import java.util.Scanner;
class A {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Drink d = input();

        System.out.println("Drink name: " + d.getName());
        System.out.println("Size: " + d.getSizeMl() + "ml");

        System.out.print("Container: ");
        switch (d.getContainer()) {
            case 'b':
                System.out.println("bottle"); break;
            case 'c':
                System.out.println("can"); break;
            case 'g':
                System.out.println("glass"); break;
        }
    }

    private static Drink input() {
        String name = sc.nextLine();
        int volumeMl = Integer.parseInt(sc.nextLine());
        char container = sc.nextLine().charAt(0);
        return new Drink(name, volumeMl, container);
    }
}