
public class Stringnamemax {
    public static void main(String[] args) {
       String[] names ={"Tawin","Ant","Tong","Mam","Kium","Sanya"};
       int [] money={100,500,250,550,120,430};
       System.out.println("The Richest is "+ richet(names,money));

    }
    public static String richet(String a[],int b[])
     {
       String  maxn=a[0];
       int max=b[0];
       for(int i=0;i<a.length;i++)
       {
         if(max<b[i])
         {
             max =b[i];
             maxn=a[i];
            }   
       }   
       return maxn;  
      }
} 
       
   
