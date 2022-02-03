import java.util.Scanner;
public class endloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number ;
        do{
            System.out.print("Entre odd number to exit loop : ");
            number =sc.nextInt();
            if(number %2==0)
            {
                System.out.println("y "+number+"mm");
            }
            else 
            {
                System.out.println("y "+number+"mm");
            }
        }while(number%2==0);
        System.out.println("end loop");
    }
}
