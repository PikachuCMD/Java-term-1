import java.util.Scanner;
public class B 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        Card(x);
    }
    public static void Card(String x)
    {
        if(x.length()<8)
        {
        for(int i=0;i<3;i++)
        {
            System.out.print(x+" ");
        }
        }
        else
        {
            for(int i=0;i<2;i++)
            {
                System.out.print(x+" ");
            }
        }
    }
}
