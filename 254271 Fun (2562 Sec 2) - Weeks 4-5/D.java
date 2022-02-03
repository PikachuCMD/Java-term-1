import java.util.Scanner;
import java.util.Arrays;
public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] x=new String[3];
        int [] y=new int[3];
        for(int i=0;i<x.length;i++)
        {
            x[i]=sc.nextLine();
            y[i]=x[i].length();
        }  
         Arrays.sort(y);
         if(y[0]==x[0].length()){System.out.println(x[0]);}
         else if(y[0]==x[1].length()){System.out.println(x[1]);}
         else{System.out.println(x[2]);}     
         if(y[1]==x[0].length()){System.out.println(x[0]);}
         else if(y[1]==x[1].length()){System.out.println(x[1]);}
         else{System.out.println(x[2]);}   
         if(y[2]==x[0].length()){System.out.println(x[0]);}
         else if(y[2]==x[1].length()){System.out.println(x[1]);}
         else{System.out.println(x[2]);} 
        }
}
