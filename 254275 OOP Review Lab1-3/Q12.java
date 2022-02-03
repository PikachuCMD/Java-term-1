import java.util.Scanner;
   public class Q12
   {
       public static void main(String[] args) 
       {
           String s="";
           String x=new Scanner(System.in).nextLine();
           String[] y=x.split(";");
           String[] h=y[0].split(",");
           String[] g=y[1].split(",");
            int a= Integer.parseInt(h[0]);
            int b=Integer.parseInt(h[1]);
            int c=Integer.parseInt(g[0]);
            int d=Integer.parseInt(g[1]);

            if(a<c)
            {
                for(int i = a; i <b; i++)
                {
                       s+= "["+i+","+(i+1)+"],";
                }
                for(int i = c; i <d; i++)
                {
                    if(i<d-1)
                    {
                     s+= "["+i+","+(i+1)+"],"; 
                    } 
                    else
                    {
                        s+="["+i+","+(i+1)+"]"; 
                    }
                }
                System.out.print("["+s+"]");
            }
          else
          {
            for(int i = c; i <d; i++)
            {
               s+= "["+i+","+(i+1)+"],";

            }
           for(int i = a; i <b; i++)
            {
               if(i<b-1)
                {
                 s+= "["+i+","+(i+1)+"],"; 
                } 
            else
                {
                s+="["+i+","+(i+1)+"]"; 
                }
            }
        System.out.print("["+s+"]");
          }
      }
}