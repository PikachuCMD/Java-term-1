import java.util.Scanner;
class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String artist = sc.nextLine();
        int songs = Integer.parseInt(sc.nextLine());

        Album album1 = new Album(title, artist, songs);
        if (album1.isEP()) {
            System.out.println(album1.getTitle() + " is short");
        } else {
            System.out.println(album1.getTitle() + " is normal");
        }
    }
}