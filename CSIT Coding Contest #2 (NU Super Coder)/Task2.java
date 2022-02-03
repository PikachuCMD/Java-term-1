import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x="";
        do{
            String y=sc.nextLine();
            if(y.equals("***")){break;}
            x+=y+" ";
        }while(true);
        String[] z=x.split(" ");
        int a=0;
        int b=0;
        for(int i=0;i<z.length;i++)
        {
             if(z[i].charAt(0)!='?'|| z[i].charAt(0)!='!'||z[i].charAt(0)!=','||z[i].charAt(0)!=':'||z[i].charAt(0)!='.')
             {
                 a++;
             }
        }
        for(int i=0;i<x.length();i++)
        {
             if(x.charAt(i)=='?'|| x.charAt(i)=='!'||x.charAt(i)==','||x.charAt(i)==':'||x.charAt(i)=='.')
             {
                 b++;
             }
        }
          if(a>1)
          {
            System.out.println(a+" words");
          }
          else{
            {
                System.out.println(a+" word");
              }
          }
          if(b>1)
          {
            System.out.println(b+" punctuation marks");
          }
          else{
            {
                System.out.println(b+" punctuation mark");
              }
          }
    }
}


