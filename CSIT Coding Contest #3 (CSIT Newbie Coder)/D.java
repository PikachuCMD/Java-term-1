import java.util.Scanner;
public class D
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long input = in.nextLong();
        long sum = 0;
        for (long c = input; c >= 1; c = c / 10)
        {
            sum += (c % 10);
        }
        System.out.print(sum);
    }
}