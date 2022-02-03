import java.util.Scanner;
public class Q07 {
       public static void main(String[] args) {
           int x=new Scanner(System.in).nextInt();
           if(x%4==0 && x%100==0 && x%400==0)
           {
              
               System.out.print("ture");
           }
            else if(x%100==0 && x%400!=0)
               {
               System.out.print("false");
               }
       }
}
