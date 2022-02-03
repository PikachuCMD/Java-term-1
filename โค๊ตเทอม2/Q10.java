import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] x=new String[100];
          String z;
         int a=0;
       
          do{
              z=sc.nextLine();
               if(z.equals("*")) break;
              x[a]=z;
              
              a++;
          } while(!z.equals("*"));
        for(int i=0;i<a;i++)
        {
            System.out.print(x[i]+" ");
           
        }
    }
}
