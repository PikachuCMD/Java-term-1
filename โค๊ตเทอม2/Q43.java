import java.util.Scanner;
public class Q43 {
    public static void main(String[] args) {
        String[] y=new String[1000];
        String x;
        int i=0;
        do{
            x=new Scanner(System.in).nextLine();
            if(x.equals("quit")) break;
            y[i]=x;
            i++;
        }while(true);
        for(int a=0;a<i;a++)
        {
            System.out.println(y[a].charAt(1)+""+y[a].charAt(2)+""+y[a].charAt(3));
        }
    }
}
