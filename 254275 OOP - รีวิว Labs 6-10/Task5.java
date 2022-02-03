import java.util.Scanner;
class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movie = sc.nextLine();
        int songs = Integer.parseInt(sc.nextLine());

        Soundtrack st1 = new Soundtrack(movie + " Soundtrack", "Various Artists", songs, movie);
        System.out.print("There are " + st1.getSongs());
        System.out.println(" songs in the movie " + st1.getMovie());
    }
}