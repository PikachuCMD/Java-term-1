import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] x=new String[100];
        int a=0;
        do{
            String z=sc.nextLine();
           if(z.equals("quit")){break;} 
            x[a]=z;   
           a++;                     
        }while(true);
        for(int i=0;i<a;i++)
        {
            System.out.println(x[i].charAt(0)+""+x[i].charAt(x[i].length()-1));
        }

    }
}
