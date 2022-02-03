import java.util.Scanner;
public class loob03 {
    public static void main(final String[] args) {
        name();
        foryour();
        Bless();
    }
    public static void foryour() {
         Scanner sc = new Scanner(System.in);
        System.out.print(" Is it your birthday today? :");
        char x = sc.next().charAt(0);p
        int num;
        if (x == 'Y' || x == 'y')
        {
            System.out.print(" Find the solution of the equation : ");  //when x=1,3  and x^2-4x+3=0
            num = sc.nextInt();
            while (num <= -1 || num >= 1)
            {
            System. out.print("  Try again : ");
              num = sc.nextInt();
            }
            if (num == 0)
            {
            System.out.println(" Congratulations, this is your birthday ");
            }
            else
            {
            System.out.println(" No ");
            }
        }
    }
    public static void name()
    {
        final  String [] name = { "hi","Congratulations", "but"};
        for (int i = 0; i < name.length; i++)
        {
       System.out.print(name[i] + " ");
        }
    }
    public static void Bless()
    {
        System.out.println("Since today is your birthday so");
        System.out.println("I will wish you");
        System.out.println("Very happy ");
        System.out.println("Is loved by everyone");
        System.out.println("Best wishes for successe");
        System.out.println("May you be good at any language");
        System.out.println("Become the best professional progaming master than anyone.");
        System.out.println("I love you so much.");
        System.out.println("Thank you very much from the heart. ");
    }
  }