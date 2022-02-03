import java.util.Scanner;

public class tast004 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String input =sc.nextLine();
     String[] num=input.split(",");
      int[] arr =new int[num.length];
  for(int i=0;i<num.length;i++)
       {
       arr[i]=Integer.parseInt(num[i]);
       }
       int[] as=new int[arr.length];
       for(int i=0;i<arr.length;i++)
       {
           for(int j=arr.length;(j-1)>=0;j--){
           if(arr[i]==arr[j]){
               as[j]=arr[j];
               break;
           }
           System.out.print(arr[i]);

       }
       }
    }
}
 