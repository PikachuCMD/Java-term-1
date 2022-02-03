import java.util.Scanner;
public class test001 {
       
          public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int[] num =new int[8];
            for (int i=0;i<num.length;i++){num[i]=sc.nextInt();}
          int maxcouple=num[0];
          int mincouple=num[0];
          int maxodd=num[0];
          int minodd=num[0];
      for (int i=0;i<num.length;i++)
              {
          if(num[i]%2==0)
                  {
            if(maxcouple<num[i]){maxcouple=num[i];}
            else{if(mincouple>num[i]){ mincouple=num[i];}        
              }}
         else{ if(maxodd<num[i]){maxodd=num[i];}else{if(minodd>num[i]){ minodd=num[i];
              }} }
           System.out.println("maxcouple : "+maxcouple);
            System.out.println("mincouple : "+mincouple);
            System.out.println("maxcodd : "+maxodd);
            System.out.println("mincodd : "+minodd);
          }
        }
      }      
                         
                 
            
        
                       
                  
                     
                                            
                   
                
                  
                 
                
               