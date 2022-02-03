import java.util.Scanner;
public class Lab3Task2B {
    public static void main(String[] args) {
        System.out.print("card : ");
           String card=new Scanner(System.in).nextLine();
           
           String[] card1=card.split(" ");
           double[] card2 =new double[card1.length];
           double card3=0;
           for(int i=0;i<card1.length;i++)
           {
               card2[i]=Double.parseDouble(card1[i]);
               card3+=card2[i];
           }
           card3=card3/card1.length;
           System.out.print("Your average card is: "+card3);
    }
}
