import java.util.Scanner;
class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String artist = sc.nextLine();
        int songs = Integer.parseInt(sc.nextLine());

        Album a1 = new Album(title, artist, songs);
        System.out.println(a1.getTitle() + " by " + a1.getArtist() + " is " + a1.getSongs() + " songs");
    }
}