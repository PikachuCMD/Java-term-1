import java.util.Scanner;
public class Lab3Task2 {
    public static void main(String[] args) {
        int[] x=new int[10000];
        int a=0;
        do{
            int z=new Scanner(System.in).nextInt();
            if(z==0){break;}
            if(z!=0){x[a]=z;}            
            a++;
        }while(true);
    for(int i=a-1;i>=0;i--)
        {
            System.out.println(x[i]);
        }
    
    }
}
