import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x="";
        do{
            String y=sc.nextLine();
             if(y.equals("END")){break;}
            x+=y;
           
           
        }while(true);
        String[] z=x.split("");
        System.out.print(z.length-1);
    }
}
