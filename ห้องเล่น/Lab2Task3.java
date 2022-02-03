import java.util.Scanner;
public class Lab2Task3 {
    public static void main(String[] args) {  
    Scanner sc=new Scanner(System.in);
    int a=0;
    do{
        int x=sc.nextInt();
        a+=x;
        if(x==0){break;}
    }while(true);
    System.out.print(a);
}
}
