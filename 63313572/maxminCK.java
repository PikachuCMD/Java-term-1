import java.util.Scanner;
public class maxminCK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num =new int[8];
        for (int i=0;i<num.length;i++)
      {num[i]=sc.nextInt();}
         max(num);
         min(num);       
    }
      public static void max (int a[])
      {
      int maxcouple=a[0];
      int mincouple=a[0];
  for (int i=0;i<a.length;i++)
          {
              if(a[i]%2==0)
              {
              if(maxcouple<a[i])
              {
                  maxcouple=a[i];
              }
          }
            if(mincouple>a[i])
              {
                mincouple=a[i];
              }
             }
        System.out.println("maxcouple : "+maxcouple);
        System.out.println("mincouple : "+mincouple);
      }
    
      public static void min (int b[])
      {
          int minodd=b[0];
          int maxodd=b[0];
          for (int i=0;i<b.length;i++)
          {
              if(b[i]%2==1)
              {
              if(maxodd<b[i])
              {
                  maxodd=b[i];
              }
              if(minodd>b[i])
            {
              minodd=b[i];
            }
          }
        }
      
      System.out.println("maxodd : "+maxodd);
      System.out.println("minodd : "+minodd);
      }
}

          