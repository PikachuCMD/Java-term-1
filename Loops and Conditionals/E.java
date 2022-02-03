import java.util.Scanner;
public class E {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=0;
        String z="";
        for(int i=x;i>0;i--)
        {
          y+=i;
          z+=i;
          if(i>1)
          {
              z+=" + ";
          }
        }
        System.out.print(z+" = "+y);
    }
}
