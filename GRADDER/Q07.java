import java.util.Scanner;
public class Q07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String x=sc.nextLine();
       int y=sc.nextInt();
       if(y<x.length()){System.out.println(x.charAt(y-1));}
      else{System.out.println("error");}}}
