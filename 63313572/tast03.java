import java.util.Scanner;
public class tast03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        String[]y=sc.nextLine().split(" ");
        int[]z=new int[y.length];
        for(int i=0;i<y.length;i++)
        {
            z[i]=Integer.parseInt(y[i]); 
        }
        for(int i=0;i<z.length;i++)
        {
            if(z[i]<z[z.length-1])
            {
               System.out.print(z[i]+" ");
            }
        }
    }
    
}
