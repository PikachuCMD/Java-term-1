import java.util.Scanner;
class TestE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char size = sc.nextLine().charAt(0);
        String colour = sc.nextLine();
        TShirt fav = new TShirt(size, colour);
        System.out.println("My favorite t-shirt is size " + fav.getSize() + " and " + fav.getColour());
    }
}