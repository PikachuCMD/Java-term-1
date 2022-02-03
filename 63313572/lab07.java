import java.util.Scanner;

public class lab07  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if (input % 2 == 0 && input % 3 == 0) 
        {System.out.print("23");}
        else if (input % 2 != 0 && input % 3 != 0) 
        {System.out.print("-");}
        else if (input % 3 == 0) 
        {System.out.print("3");}
        else if (input % 2 == 0)
         {System.out.print("2");}
    }
}
