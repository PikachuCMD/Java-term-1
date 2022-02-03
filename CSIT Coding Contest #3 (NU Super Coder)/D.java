import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String x=sc.nextLine();
         String[] x1=x.split(" ");
         int xx=Integer.parseInt(x1[0]);
         int xy=Integer.parseInt(x1[1]);
         int radius=Integer.parseInt(x1[2]);

         int y=sc.nextInt();
         int zx;
         int zy;
         int zp;
         int id;    

         for(int i=0;i<=y+1;i++)
         {
             String z[]=sc.nextLine().split(" ");
             zx=Integer.parseInt(z[0]);
             zy=Integer.parseInt(z[1]);
             zp=Integer.parseInt(z[2]);
             id=Integer.parseInt(z[3]);

         } 
         for(int i=0;i<y+1;i++)
         {
             System.out.println();


         }

        
    }
}
