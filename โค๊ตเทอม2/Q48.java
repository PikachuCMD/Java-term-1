import java.util.Scanner;

public class Q48 {

   public static void main(String[] args) {
      int x=new Scanner(System.in).nextInt();
      int y=new Scanner(System.in).nextInt();
      int z=y-x;
      int coin_20,coin_10, coin_5, coin_2, coin_1; 
      int money, remain; 
    
      remain = money = coin_20 = coin_10 = coin_5 = coin_2 = coin_1 = 0; 
       money=z;
      coin_20 = money /20;
      remain  = money %20;
      coin_10 = money / 10; 
      remain  = money % 10;  
      coin_5  = remain / 5;  
      remain  = remain % 5;  
      coin_2  = remain / 2;  
      remain  = remain % 2; 
      coin_1  = remain;      
      System.out.println("20 = " + coin_20+" coins.");
      System.out.println("10 = " + coin_10 + " coins.");
      System.out.println("5  = " + coin_5 + " coins.");
      System.out.println("2  = " + coin_2 + " coins.");
      System.out.println("1  = " + coin_1 + " coins.");
   }
}