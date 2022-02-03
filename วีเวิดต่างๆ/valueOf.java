import java.util.Scanner;
public class lood005 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
         for(int i=1;i<=x;i++)
        {
            String s=String.valueOf(i);
            if(s.contains("5"))
            {
                continue;
            }  
            else if(s.contains("9"))
            {
                   System.out.println("Luck");
            }  
            else 
            {
                System.out.println(i);
            }
        }   
             
    }
}
      
       
      
       
          
            

  