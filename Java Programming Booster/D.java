import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]y=new String[3];
        String a="";
        String b="";
        String c="";
        for(int i=0;i<3;i++)
        {
            y[i]=sc.nextLine();

        }
        for(int i=0;i<y[0].length();i++)
        {
              if(i<1)
              {
                  a+=y[0].toUpperCase().charAt(i);
              }
              else{
                a+=y[0].toLowerCase().charAt(i);
              }
        }
        for(int i=0;i<y[1].length();i++)
        {
            if(i<1)
            {
                b+=y[1].toUpperCase().charAt(i);
            }
            else{
              b+=y[1].toLowerCase().charAt(i);
            }
        }
        for(int i=0;i<y[2].length();i++)
        {
            if(i<1)
              {
                  c+=y[2].toUpperCase().charAt(i);
              }
              else{
                c+=y[2].toLowerCase().charAt(i);
              } 
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
}
