
import java.util.Scanner;
public class prime01 
{
    public static void main(String[] args) 
    {
    Scanner key =new Scanner(System.in)  ;
    System.out.println("enter n :");
    int n =key.nextInt();
    int total=0;
        for(int j=1;j<=n;j++)
        {
          if(n%j==0)
          {
              total=total+j;
            }
        }
          if(total>(1+n))
          {
              System.out.print(n+"in not prime. ");
            }
          else 
          {
              System.out.print(n+"in prime");
            }
          }
        }