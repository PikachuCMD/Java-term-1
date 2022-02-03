import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String[] x=new String[10000];   
         int s=0;
        do{
            String a=sc.nextLine();
            if(a.equals("***")){break;}
            x[s]=a;
            s++;
        }while(true);       
        for(int i=s-1;i>=0;i--)
        {
            System.out.println(x[i]);
        }
    }
}
