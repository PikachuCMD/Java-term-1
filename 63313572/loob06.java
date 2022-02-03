import java.util.*;
public class loob06 
{
    public static void main (String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	int x=sc.nextInt();
    	
    for (int a=1;a<=x;++a)
        {
         for (int i=1;i<=x;++i)
    		        {
        if (i!=(x-1))
          System.out.print("*");
          else
          {
              if(i!=(x-1))
                 {
                     System.out.print("*");
                 }
            else 
            {
                System.out.print("*");
            }
          }
                }
        System.out.println();
    	  }
      }
    }
   

