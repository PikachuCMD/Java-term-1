import java.util.Scanner;
public class Palace2 {
    private int castle;
    private int principality;
    private String palace;
      
       public Palace2(int castle,int principality,String palace)
       {
           this.castle=castle;
           this.principality=principality;
           this.palace=palace;
       }
       public int getCastle()
       {
           return castle;
       }
       public int getPrincipality()
       {
           return principality;
       }
       public String toString()
       {
               if(castle>5 
               )
               {
                   return "Palace "+palace+" is a Large Palace";
               }
               else
               {
                return "Palace "+palace+" is a Normal Palace";
               }
    }

       public static void main(String[] args)
       {
           Scanner sc = new Scanner(System.in);
            int castle = Integer.parseInt(sc.nextLine());
            int principality = Integer.parseInt(sc.nextLine());
            String palace=sc.nextLine();
            Palace2 p = new Palace2(castle,principality,palace);
            System.out.println(p.toString());
       }
     
}

