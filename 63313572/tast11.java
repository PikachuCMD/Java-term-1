import java.util.Scanner;
public class tast11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("*****menu*****");
        System.out.println("1:coffee \n2:tea \n3:water \n4:capushino \n5:sugar");
        System.out.print ("your menu :");
        int x =  sc.nextInt();
        System.out.print("How old are you :");
        int y = sc.nextInt();
        if (y<=16) {
           if (x==1){
             System.out.println ("coffee "+(50-(0.10*50))+" bath");
           }
           else if (x==2){
             System.out.println("tea " + (45-(0.10*45))+" bath");
           }
           else if (x==3){
             System.out.println("water " +(35-(0.10*35))+" bath"); 
           }
           else if (x==4){
             System.out.println("capushino "+(55-(0.10*55))+" bath");
           }
           else if (x==5){
             System.out.println("sugar "+(35-(0.10*35))+" bath");
            }
          else {
            System.out.println (" you cancel ");
          }
     }
    else {
      if (x==1){
        System.out.println ("coffee "+50+" bath");
      }
      else if (x==2){
        System.out.println("tea "+45+" bath");
      }
      else if (x==3){
        System.out.println("water "+15+" bath"); 
      }
      else if (x==4){
        System.out.println("capushino "+55+" bath");
      }
      else if (x==5){
        System.out.println("sugar "+35+" bath");
       }
     else {
       System.out.println ("you cancel");
     }
    }
  }
}
        
      