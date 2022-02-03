import java.util.Scanner;

class Input {

    public static String[] stringArray() {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        String[] result = input.split(",");
        return result;
    }

    public static int[] intArray() {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        String[] parts = input.split(",");

        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }

}