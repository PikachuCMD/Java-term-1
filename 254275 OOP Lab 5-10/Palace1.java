import java.util.Scanner;
public class Palace1 {
    private int castle;
    private int principality;
      
       public Palace1(int castle,int principality)
       {
           this.castle=castle;
           this.principality=principality;
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
           int x=castle+principality;
           String y="Palace of Atom has The sum of the castle and principality amount ";
           return     y+x;
       }
       public static void main(String[] args)
       {
           Scanner sc = new Scanner(System.in);
            int castle = Integer.parseInt(sc.nextLine());
            int principality = Integer.parseInt(sc.nextLine());
            Palace1 p = new Palace1(castle,principality);
            System.out.println(p.toString());
       }
     
}

