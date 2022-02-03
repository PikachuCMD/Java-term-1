import java.util.*;
public class ctrlz{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String input = "";
        while (in.hasNext()) {
            input += in.nextLine();
        }
        String[] arrOfInput = input.split(" ");
        for (int counter = arrOfInput.length - 1; counter >= 0; counter--) {
            System.out.print(arrOfInput[counter] + " ");
        }
    }
}