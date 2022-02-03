import java.util.Scanner ;
public class lab08
{  
     public static void main(String[] args) 
    {
          Scanner sc=new Scanner (System.in);
          String name ;
         int c=0; 
        do{
               name=sc.nextLine();
               if(name.equals("stop"))
               {
                   break;
               }
               
              c+=name.length();
               
          } while(!name.equals("stop"));
         System.out.print(c);
    }
}
    
         
