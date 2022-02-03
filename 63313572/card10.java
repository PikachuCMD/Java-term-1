import java.util.Scanner ;
public class card10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int x=sc.nextInt();
          int y=sc.nextInt();
          int a=(x*60)*60+(y*60);
          System.out.print("Total number of seconds: "+a);
    }
}
         
        