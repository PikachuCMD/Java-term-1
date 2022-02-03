import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         String[] x=new String[10000];
         int i=0;
         while(sc.hasNext())
         {
             String y=sc.nextLine();
             if(y.equals("***")){break;}
             x[i]=y;
             i++;
         }
           int b=0;
           int c=0;
         for(int a=0;a<i;a++)
         {
           if(x[a].equals("Ping"))
            {   
                    b++;
                if(a<i-1)
             {
                  if(x[a+1].equals("Pong") )
                    {                        
                        b--;
                    }
             }
            }
                else if(x[a].equals("Pong"))
                 {
                     c++;
                     if(a<i-1)
                   {          
                     if(x[a+1].equals("Ping"))
                     {                        
                        c--;
                     }       
                   }
                 } 
         }
        System.out.println(b+":"+c);
    }
}