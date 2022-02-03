import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] x=new int[1000000];
        int i=0;
       int max1=x[0];
        int max2=x[0];
        do{
            int y=sc.nextInt();
            x[i]=y;
            if(y==-1){break;}
            i++;
        }while(true);
        for(int a=0;a<i;a++)
        {
        if(max1<x[a])
        {
            max1=x[a];
        }
        
      }
      for(int a=0;a<i;a++)
      {
        if(max2<x[a] && max1!= x[a])
        {
            max2=x[a];
        }
    }
      System.out.println(max1);
      System.out.println(max2);
    }
}
