import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();//a,b,c,d,e
        String[] y=x.split(",");   // 0=a 1=bb 2=ccc 3=ddddd 4=eeeee    
        int min =y[0].length();//0.2
        String v=y[0];//a
        for(int i=0;i<y.length;i++)
        {
            if(min>y[i].length()) 
            {
              min=y[i].length();
                v=y[i];
            }
            
        }
         System.out.print(v);
    }
}
