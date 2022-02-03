import java.util.Scanner;
public class Q5
{
    public static void main(String[] args) 
    {
    Scanner sc =new Scanner(System.in)  ;
     int n =sc.nextInt();
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
              System.out.print("N");
            }
          else 
          {
              System.out.print("Y");
            }
          }
        }