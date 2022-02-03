import java.util.Scanner;
class Task2 {

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String artist = sc.nextLine();
        int songs = Integer.parseInt(sc.nextLine());

        Album album1 = new Album(title, artist, songs);
        System.out.println(album1.toString());
    }
}