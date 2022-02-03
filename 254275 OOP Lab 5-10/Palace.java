import java.util.Scanner;
public class Palace {
    private int castle;
    private int principality;
      
       public Palace(int castle,int principality)
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
    public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);
          Palace p = new Palace(sc.nextInt(), sc.nextInt());
          System.out.print("Palace of Atom has "+p.getCastle()+ " Castle");
          if(p.getCastle()>1)
          {
              System.out.print("s");
          }
          System.out.print(" including "+p.getPrincipality()+" Principality");
          if(p.getPrincipality()>1)
          {
              System.out.print("s");
          }
       }
}

