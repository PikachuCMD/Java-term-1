import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int a=0;
         String[] input=new String[1000];
        
         int number[]=new int[input.length];
        do{
            input[a]=sc.nextLine();                    
            if(input[a].equals("-1"))break; 
            a++;
        }while(true);

        for(int i=0;i<a;i++)
        {
          number[i]=Integer.parseInt(input[i]);
        }
        int max=number[0];
        int max1=number[0];
        for(int i=0;i<a;i++)
        {
            if(max<number[i])
            {
                max=number[i];
            }
            if(max1<number[i] && number[i]!=max)
            {
                max1=number[i];
            }
        }
        System.out.println(max);
        System.out.println(max1);
    }
}
