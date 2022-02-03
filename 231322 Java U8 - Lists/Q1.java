import java.util.Scanner;
class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String y="";
        String[] x=y.split(",");
        while(true)
        {
            String z=sc.nextLine();
            y+=z+",";
        }
        System.out.println("Total words: "+x.length);
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }
    }
}