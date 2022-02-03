import java.util.Scanner;
   public class minmax {
       public static void main (String[]agrs){
           Scanner sc=new Scanner(System.in);
           int[] a=new int[8];
           
           int max=0;
           int min=0;
           for(int i=0;i<a.length;i++)           
           {int x= sc.nextInt();
            a[i]=x;
           if (max<a[i] && a[i]%2==1)
           {max=a[i];}
           if(min>a[i] && a[i]%2==0 && a[i]!=0)
           {min=a[i];}
           }
           System.out.println("max "+max);
           System.out.println("min "+min);
       }
   }