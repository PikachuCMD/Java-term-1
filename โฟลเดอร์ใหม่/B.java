
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          String a=sc.nextLine();
          String b=sc.nextLine();
          if(a.length()==b.length())
          {
              System.out.print("EQUAL");
          }
          else{
            System.out.print("NOT EQUAL");

          }
    }
}