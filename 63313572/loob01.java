import java.util.Scanner ;
public class loob01 
{  
     public static void main(String[] args) 
    {
          Scanner sc=new Scanner (System.in);
          String[] names=new String[1000];
          String z=sc.nextLine();
          int i=0;
          while(!z.equals("*"))
          {
              names[i]=z;
              i++;
              z =sc.nextLine();

          }
          for (int f=i;f>0;f--)
              {
                  System.out.println(names[f-1]);
              }
    }
}
        
         
