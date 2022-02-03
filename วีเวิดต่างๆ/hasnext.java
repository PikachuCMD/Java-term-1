import java.util.*;
import java.util.regex.Pattern;

public class hasnext {
   public static void main(String[] args) {

      String s = "Hello World! 3 + 3.0 = 6";

      // create a new scanner with the specified String Object
      Scanner scanner = new Scanner(s);

      // check if the scanner has a token
      System.out.println("" + scanner.hasNext());

      // print the rest of the string
      System.out.println("" + scanner.nextLine());

      // check if the scanner has a token after printing the line
      System.out.println("" + scanner.hasNext());

      // close the scanner
      scanner.close();
   }
}
/*int[] jolly;
         String[] in;

         in=sc.nextLine().split(" ");
         jolly=new int[in.length-1];

         for(int i=0;i< in.length-1;i++)
         {
             jolly[i]= Math.abs(Integer.parseInt(in[i])-Integer.parseInt(in[i+1]));
             Arrays.sort(jolly);
         }
         for(int i=0;i<=in.length-1;i++)
         {
             if(jolly[i-1] !=i)
             {
                 System.out.println("Not jolly");
                 return;
             }
         }
        System.out.println("Jolly");
        }

    }*/
