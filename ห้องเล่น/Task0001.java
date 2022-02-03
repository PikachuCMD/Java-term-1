import java.util.Scanner;

class Task0001 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    int num = name.length();

    for (int i = 0; i < name.length(); i++) {

      for (int j = 0; j < num; j++) {
        System.out.print(name.charAt(j));

      }
      num--;
      System.out.println();
    }
  }
}