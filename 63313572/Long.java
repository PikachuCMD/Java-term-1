import java.util.Scanner ;
public class Long {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();     //053408   
        long y=0;
        double[]a=new double[5];
         for (int i=1;i<=5;i++)
         {
           a[i]=Math.pow(2, i);
         }

        /* c=053408*/  /*053408*/   /*053408/10=5340.8   */
       for(int i=0;i<=5;i++){
        for (long c = x; c >= 1; c = c / 10) 
        {
            y =(c%10);
       
        }
       
    }
          System.out.print(y+" ");  //=20#   
      }
    }
   