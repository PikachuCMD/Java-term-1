import java.util.Scanner;
public class Q52 {
    public static void main(String[] args) {
        String x="";
        String y;
        do{
               y=new Scanner(System.in).nextLine();
               if(y.equals("*")) break;
               x+=y;
        }while(true);
        String[] g=x.split("");
        int t=0;
        for(int i=0;i<g.length;i++)
        {
            if(g[i].equalsIgnoreCase(";")) t++;
        }
        System.out.print(t);
    }

}
