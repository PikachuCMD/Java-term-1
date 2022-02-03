import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String[] y=x.split(",");
        String z="";
        for(int i=y.length-1;i>=0;i--)
        {
           z+=y[i];
           if(i>0)
           {
               z+=",";
           }
        }
        if(x.equals(z))
        {
            System.out.print(true);
        }
       else
        {
            System.out.print(false);
        }
      
    }
    
}