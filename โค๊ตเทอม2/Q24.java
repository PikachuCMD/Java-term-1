import java.util.Scanner;

public class Q24 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String x = "";
    int s = 0;
    do {
      String f = sc.nextLine();
      if (f.equals("***"))
        break;
      x += f + " ";
      s++;

    } while (true);

    String words[] = x.split(" ");

    int wordCount = 0, punCount = 0;
    wordCount = words.length;

    for (int i = 0; i < words.length; i++) {
      for (int j = 0; j < words[i].length(); j++) {
        if (chkPun(words[i].charAt(j))) {
          punCount++;
        }
      }
    }
    if (wordCount > 1) {
      System.out.println(wordCount + " words");
    } else {
      System.out.println(wordCount + " word");
    }
    if (punCount > 1) {
      System.out.println(punCount + " punctuation marks");
    } else {
      System.out.println(punCount + " punctuation mark");
    }
  }

  static boolean chkPun(char a) {
    if (a == ',' || a == '!' || a == '.' || a == '?') {
      return true;
    }
    return false;
  }
}