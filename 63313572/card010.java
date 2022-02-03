import java.util.Scanner;
public class card010 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String[] y=x.split(" ");
        int[] z=new int[y.length];
        int c=0;
        for(int i=0;i<y.length;i++)
        {
            z[i]=Integer.parseInt(y[i]); 
        }
        for(int a=0;a<y.length;a++)
        {
            if(z[a]==z[a])
            {
            System.out.print(z[a]+" ");
            }



        

        }


    }

}