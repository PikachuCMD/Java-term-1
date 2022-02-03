import java.util.Scanner;
public class E {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
          int a=0;
          String z="";
          for(int i=x;i>0;i--)
          {
              a+=i;
              if(i>1)
              {
              z+= i+" + ";
              }
              else
              {
                  z+=i;
              }
          }
          System.out.print(z+" = "+a);
    }
}
