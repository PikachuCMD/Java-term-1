
import java.util.Scanner;

public class E 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        String[] names=new String[1000];
        String name =sc.nextLine();
           int i=0;
        while(!name.equals("*"))
        {
            names[i]=name;
            i++;
            name =sc.nextLine();
            }
        for(int z = 0; z < i; z++)
                {
           if (z == i/2)
                    {
                       if(i%2==0)
                         {
                        System.out.println(names[z-1]);
                        }
                        System.out.println(names[z]);
                    }
                  
           
                }
                
            }
    
}