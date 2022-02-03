/*import java.util.Scanner;
public class Integer {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String input =sc.nextLine(); //input
      String sum =sc.nextLine();   //input
      String[] num=input.split(" ");   //split :input
      String[] mum=sum.split(" ");      //split :input
      int[] a =new int[num.length];     
      int[] b=new int[mum.length];
      int n=0;
      for(int i=0;i<num.length;i++)
                {
              a[i]=Integer.parseInt(num[i]); 
                }
            for(int i=0;i<mum.length;i++)
                  {
              b[i]=Integer.parseInt(mum[i]);
                  }
       for(int i=0;i<num.length;i++)
            {
              for(int j=0;j<mum.length;j++)
              {
                if(a[i]==b[j])
                {
                  n++;
                  System.out.print(a[i]+" ");
                }
              }
            }
            System.out.println("\nvolume"+n);

          }

    public static int parseInt(char c) {
        return 0;
    }
        }*/