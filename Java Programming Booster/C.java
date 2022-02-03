import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String a="";
        String b="";      
        for(int i=0;i<x.length();i++)
        {
            if(i==0)
            {
                  a+=x.charAt(i);
            }           
            if(i<5)
            {
               b+=x.charAt(i);
            }               
        } 
        System.out.println(a);
        System.out.println(b);
        System.out.println(x.toUpperCase());
    }
}
