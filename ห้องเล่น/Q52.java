import java.util.Scanner;
import java.util.Arrays;

public class Q52 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    String inputs = in.nextLine();
    String[] part;
    String temp;
    part = input.split(",");
    temp = inputs;
    String answer = "";

    for (int i = 0; i < part.length; i++) {
      if (temp.contains(part[i]) && !answer.contains(part[i])) {
        answer += part[i];
        if (i < part.length - 1) {
          answer += ",";
        }
      }
    }
    if (answer.charAt(answer.length() - 1) == ',') {
      answer = answer.substring(0, answer.length() - 1);
    }
    String[] tmp = answer.split(",");
    Arrays.sort(tmp);
    for (int i = 0; i < tmp.length; i++) {
      if (i < tmp.length - 1) {
        System.out.print(tmp[i] + ",");
      } else {
        System.out.print(tmp[i]);
      }
    }
  }
}