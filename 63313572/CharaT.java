import java.util.Scanner; 
public class CharaT {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String x =sc.nextLine();
            char y;
            int ct =0;
            int st =0;

            for (int i=0;i<x.length();i++)
            {
                y = x.charAt(i);
                if (y=='S')
                {
                    st++;
                }
                if(y=='C')
                {
                    ct++;
                }
            }
        if (st==ct) 
          {
            System.out.print("true");
          }
        else
            {
            System.out.print("false");
            }
    }
}
