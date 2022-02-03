import java.util.Scanner;
class A
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        boolean z=Card(x,y);
         if(z)
         {
             System.out.print(x);
         }
         else
         {
              System.out.print(y);
         }
    }
    public static boolean Card(int x,int y)
    {
          if(x<y)
          {
              return true;
          }
          else
          {
               return false;
          }
    }
}