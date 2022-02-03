import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line[] = sc.nextLine().split(",");
        boolean tool = AllAreEqual(line);
        System.out.println(tool);
    }

    static boolean AllAreEqual(String line[]) {
        int match = line.length;
        int matchCount = 0;

        for (int i = 0; i < line.length; i++) {
            if (line[0].equals(line[i])) {
                matchCount++;
            }
        }
        if (matchCount == match) {
            return true;
        } else {
            return false;
        }
    }
}
