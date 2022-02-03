import java .util.Scanner;
public class namerwers {
         public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             System.out.print("How many texts? :");
             int x=sc.nextInt();
             String[] y=new String[x];
            int i;
             for(i=0;i<x;i++)
            {
                System.out.println("Number:#"+(i+1));
                System.out.print("Name: ");
                 y[i]=sc.next();
                 
           
            }
            for(int a=i;a>0;a--)
            {
                System.out.println((y[a-1])+" " +a);
            }
          
            
        }
        }
            