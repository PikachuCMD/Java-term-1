import java.util.Scanner;
class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movie = sc.nextLine();
        int songs = Integer.parseInt(sc.nextLine());
        
        Album st1 = new Soundtrack(movie + " Soundtrack", "Various Artists", songs, movie);
        System.out.println(st1.toString());
    }
}
