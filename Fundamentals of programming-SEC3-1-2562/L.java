import java.util.Scanner;
public class L {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] x=new int[1000];
        int max=0;
        int a=0;
        do{           
             int z=sc.nextInt();
              if(z==0){break;}
              x[a]=z;
             a++;
        }while(true);
        int c=0;
        for(int i=0;i<a;i++)
        {
            if(x[i]!=0){
            if(x[i]%2==0)
            {     
                c++;
                   max+=x[i];
                   
            }
        }
        }
        System.out.println(c);
        System.out.println(max);
    }
}
