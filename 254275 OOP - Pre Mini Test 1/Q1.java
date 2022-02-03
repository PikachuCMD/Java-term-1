import java.util.Scanner;
class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            if(i<x){System.out.print(9*i+", ");}
            else{System.out.print(9*i);}
        }
    }
}