
import java.util.Scanner;
public class Q9 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        // int a=0;
         String numname="";
         String[] numbertype=numname.split(" ");
         int[] number=new int[numbertype.length];
         do{
            // a++;
             String input=sc.nextLine();
             numname+=input+" ";
         }while(true);
         
         for(int i=0;i<numbertype.length;i++)
         {
             number[i]=Integer.parseInt(numbertype[i]);
         }
    }
}