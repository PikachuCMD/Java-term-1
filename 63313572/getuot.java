import java.util.Scanner;


public class getuot
{
   public static void main(String[] args)
   {
      while (true)
      {
          String ifyousay  = new Scanner(System.in).nextLine().toLowerCase();
          if(ifyousay.equals("getout"))
          {
            System.out.println("Congratulations");
            System.out.println("Intelligent");
            System.out.println("You Weak Up !!!");
            System.out.println("IsHasBrain "+isHasBrain(ifyousay));
            break;
          }
          else
          {
            System.out.println("IsHasBrain "+isHasBrain(ifyousay));
          }
      }
   }
   private static boolean isHasBrain(String ifyousay)
   {
     if(ifyousay.equals("getout"))
     {
       return true;
     }
     else
     {
       return false;
     }
   }
}