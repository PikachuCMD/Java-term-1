import java.util.Scanner;

public class loob03
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
           int num=sc.nextInt();
           int sum=0;
           int count=0;
           while(num!=0)
           {
             if (num%2==0)
                {
                  sum+=num;
                    count++;
                }
              num=sc.nextInt();
            }
        System.out.println(count);
        System.out.println(sum);
        }
    }

                