import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String[] y=x.split(",");
        String z="";     
        for(int i=0;i<y.length;i++)
        {
            if(!z.contains(y[i]))
            {            
                z+=y[i];

                if(i<y.length-1)
                {
                    z+=",";
                }    
            }
        }
        if(z.charAt(z.length()-1) == ',')
         {
             z = z.substring(0,z.length()-1);
         }    
    String[] tmp=z.split(",");
       for(int i=0; i<tmp.length;i++)
       {
           if(i<tmp.length-1)
           {
            System.out.print(tmp[i] +",");
           }
          else
           {
            System.out.print(tmp[i]);
           }
      }
    }
}
