import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        if(x<y)
        {
            for(int i=x+1;i<y;i++)
            {
               if(i<y-1)
               {
                System.out.print(i+",");
               }
               else{ System.out.print(i);}

                
            }
        }
        else 
        {
            {
                for(int i=y+1;i<x;i++)
                {
                    if(i<x-1)
                    {
                     System.out.print(i+",");
                    }
                    else{ System.out.print(i);}
     
            }
        }

    }
}
}

