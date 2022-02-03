import java.util.Scanner;
public class J {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] x=new int[1000];
        int max=0;
        int a=0;
        do{           
             int z=sc.nextInt();
              if(z==-1){break;}
              x[a]=z;
             a++;
        }while(true);
        for(int i=0;i<a;i++)
        {
            if(x[i]>max)
            {
                   max=x[i];
            }
        }
        System.out.print(max+" is a maximum number");
    }
}
