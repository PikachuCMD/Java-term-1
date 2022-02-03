import java.util.Scanner;
public class card {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String[] y=new String[20];
       String x=sc.nextLine();
       for(int i=0;i<y.length;i++)
       {
           x=sc.nextLine();
           if(x.equals("*"))
           {
               break;
           }
             y[i]=x;

       }
       String z=sc.nextLine();
       for(int i=0;i<y.length;i++)
       {
           if(z.equals(y[i]))
           {
               System.out.print("Y");
               break;
           }
           else{
               System.out.print("N");
               break;
           }
       }


   }    
}

    

