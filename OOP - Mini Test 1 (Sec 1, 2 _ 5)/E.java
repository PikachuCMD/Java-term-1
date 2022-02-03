import java.util.Scanner;
class TestE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char g = sc.nextLine().charAt(0);
        int s = Integer.parseInt(sc.nextLine());
        Shoe fav = new Shoe(n, g, s);
        System.out.println("My favorite shoe is " + fav.getName() + " " + fav.getGender() + " size " + fav.getSize());
    }
}