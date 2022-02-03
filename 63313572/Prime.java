import java.util.Scanner;
public class Prime {    
    public static void main(String[] args){
         int x=new Scanner(System.in).nextInt();
          for(int i=2;i<=x;i++)
          {
              test(i);   
          }                 
            }
     public static void test(int n) {
       int a=0;
            for(int j=1;j<=n;j++)
            {
              if(n%j==0)
              {
                  a+=j;                  
              }
            }
              if(a==(1+n))
              {
                System.out.print(n+" ");                
             }
        }
      }
    