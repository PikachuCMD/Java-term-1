import java.util.Scanner;
public class B {
     public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
      
         int input = in.nextInt();
        int ct4in = 0;  
                                                            
        int ct4in2 = input;                                                     
       for (int row1 = input - 1; row1 > -1; row1--) 
        {                        
         for (int hrow = 0; hrow < row1 ; hrow++) 
            {
                System.out.print(" ");
               
            }  
            System.out.print("/");                                              
            ct4in++;
         for (int in1 = 1; in1 < ct4in; in1++) 
                   {
                  System.out.print(" ");
                }    
         for (int in2 = 1; in2 < ct4in; in2++) 
            {
                System.out.print(" ");
            }      
            System.out.print("\\");                                             
            System.out.println();                                               
        }  
        for (int row1 = 1; row1<= input; row1++) {        //220000220          
            for(int i=1;i<=row1-1;i++)
            {
                System.out.print(" ");
            } System.out.print("\\");
            ct4in2--;
            for (int in1 =ct4in2; in1 > 0 ; in1--) 
            {
           System.out.print(" ");
         }    
       for (int in2 = ct4in2; in2 > 0; in2--) 
         {
         System.out.print(" ");
         }      
           System.out.print("/");                                             
           System.out.println();       
          }       
     }    
}