 import java.util.Scanner;
public class loob07 
{
        public static void main(String[] args) 
    {
           Scanner sc=new Scanner(System.in);
            int c=0;
           int d=0;
           int num;
           for (int i=1;i<=10;i++)
           {  
               num=sc.nextInt();
               if(num%2==0){
                   c++;
               }
               else{
                   d++;
               }
            }
           System.out.println(c);
           System.out.println(d);
    }
}