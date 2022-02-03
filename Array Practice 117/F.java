import java.util.Scanner;
public class card007 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String y="";
       while(sc.hasNext())
       {
           y +=sc.nextLine();
       }
       String[] x=y.split(" ");
       for(int i=x.length-1;i>=0;i--)
       {
           System.out.print(x[i]+" ");
       }
}
}
