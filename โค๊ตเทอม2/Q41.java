import java.util.Scanner; 
public class Q41 {
       public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           String[] x=new String[1000];
           int i=0;
           String y;
           do{
               y=sc.nextLine();
               if(y.equals("quit")) break;
               x[i]=y;
               i++;
           }while(true);
           for(int a=0;a<i;a++)
           {
               System.out.println(x[a].charAt(0)+""+x[a].charAt(x[a].length()-1));
           }

       }
}
