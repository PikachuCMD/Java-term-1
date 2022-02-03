import java.util.Scanner;
class Q4{
    public static void main(String[] args) 
    {
        int[] numbers = intArray();
        int result = sum(numbers);
        System.out.println(result);
    }

    public static int sum(int[] numbers)
     {
           int a=0;
           for(int i=0;i<numbers.length;i++)
           {
               a+=numbers[i];
           }
           return a;
    }
    
    public static int[] intArray()
    {
        Scanner sc=new Scanner(System.in);
         String[] x=sc.nextLine().split(",");
         int [] y=new int[x.length];
         for(int i=0;i<x.length;i++)
         {
             y[i]=Integer.parseInt(x[i]);
         }
         return y;
    }

}