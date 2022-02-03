import java.util.Scanner;
public class loob001 {
  
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("n = ");
          int n = sc.nextInt();
          int k = 2;                  
          while (true) {
            if (k >= n){
            System.out.println('Y');
             break;  }      
            if ((n % k) == 0) {
            System.out.println('Y');
            break;  }
            k++;
          }
          if(k==n)
          System.out.println('N'); 
        }
      }
    