import java.util.Scanner;
public class loob007 {
       public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           String x=sc.nextLine();
           String[] num=x.split(" ");
           int []  a=new int[num.length];
           

           for(int i=0;i<num.length;i++)
                {
              a[i]=Integer.parseInt(num[i]); 
                }
           for(int i=0;i<num.length;i++)
           {
               if(a[i]<a[a.length-1])
               {
                   System.out.print(a[i]+" ");
               }

           }
            

       }
}
