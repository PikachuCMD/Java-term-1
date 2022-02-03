import java.util.Scanner;
public class  E
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        String line = number +"";
        int sum = 0;
        for (int i = 0; i < line.length(); i++)
        {
          int base = number % 10;
          number = number/ 10;
          int pow = (int) Math.pow(2, i);
          sum += base * pow;
        }
        System.out.println(sum);
    }
}
