import java.util.Scanner;
import java.util.Arrays; 
  
public class sot 
{ 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);

       
        int[] arr = new int[3];
  
             Arrays.sort(arr);
         int i=0;
             while(i<arr.length)
             {
                 arr[i]=sc.nextInt();
             }       
  
        System.out.println(Arrays.toString(arr)); 
                          
    } 
} 