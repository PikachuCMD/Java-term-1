import java.util.Scanner;

public class cod01 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();

         for(int a=1 ;a<=x-1;a++)
            {
                 for(int s=1;s<=x;s++)
                {
                    if(s==1 || s== x)
                    System.out.print("|");
                   else 
                   {
                       System.out.print(" ");
                    }
                }
               
                System.out.println();
            }
        for(int i=1;i<=x;i++)
        {
           
            System.out.print("-");

        }
    }
}
