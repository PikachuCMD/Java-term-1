import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x="";
        do{
            String y=sc.nextLine();
            if(y.equalsIgnoreCase("stop")){break;}
            x+=y; 
        }while(true);
        System.out.print(x.length());
    }
}
