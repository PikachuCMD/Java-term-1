import java.util.Scanner;
public class Main
{

  public static void main(String[] args)
  {
      Scanner in = new Scanner(System.in);
      String name = in.nextLine();
      int age = Integer.parseInt(in.nextLine());
      String Distinction = in.nextLine();
      int RankingsGarder = Integer.parseInt(in.nextLine());

      DSG ob = new DSG (name,age,Distinction,RankingsGarder);
      System.out.println("Happy birthday to " + ob.getName()  + " now your age is " + ob.getAges() + " years old "
      + " your Distinction is " + ob.getDistinction()+" Your Rankings on grader.mobcomlab.com is "+ob.getRankingsGarder());
      System.out.println("God Soda Wish You " +ob.toString());
  }
}