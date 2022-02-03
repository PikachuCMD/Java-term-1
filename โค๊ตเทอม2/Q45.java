import java.util.Scanner;

public class Q45 {

   public static void main(String[] args) {
     int number =new Scanner(System.in).nextInt();
      boolean prime = true;      
      int limit = (int) Math.sqrt(number); 
      for (int i = 2; i <= limit; i++) { 
         if (number % i == 0) { 
            prime = false;
            break;
         }
      }
       if(prime){System.out.print('Y');}
       else{System.out.print('N');}
   }
}
/*public class Q45 {
    
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
      }*/
    