import java.util.*;

class Q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pun = 0;
        int word = 0;
        String a = sc.nextLine();
        while (!a.equals("***")) {
            String a2 = a.replaceAll("[\\p{Punct}]", "");
            pun += a.length() - a2.length();
            String array[] = a2.split(" ");
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals("")) {
                    word--;
                }
            }
            word += array.length;
            a = sc.nextLine();
        }
        System.out.print(word + " word");
        if (word > 1) {
            System.out.print("s");
        }
        System.out.println();
        System.out.print(pun + " punctuation mark");
        if (pun > 1) {
            System.out.print("s");
        }
    }
}