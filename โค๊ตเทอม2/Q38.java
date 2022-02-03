import java.util.Scanner;
public class Q38 {
       public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           String [] x=new String[10000];
         int i=0;
         String s;
        do{
            s=sc.nextLine();
            if(s.equals("***")) break;
            x[i]=s;
            i++;
        }while(true);
         
       for(int a=0;a<i;a++)
        {
            if(a<i-1){System.out.print(x[a].charAt(0)+".");}
            else{System.out.print(x[a].charAt(0));}

        }
       }
}
