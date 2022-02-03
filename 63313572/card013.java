
    import java.util.Scanner;
    public class card013 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String x=sc.nextLine();
            String[] y=x.split("");
            int[] z=new int[y.length];
            double[] c=new double[y.length];
            for(int i=0;i<y.length;i++)
            {
                z[i]=Integer.parseInt(y[i]); 
            } 
            for(int a=(y.length-1);a>=0;a--)
            { 
               c[a]=a;
               
            }
         
}
    }
      