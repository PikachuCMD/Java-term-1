import java.util.Scanner; 
public class D {
    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        int amountOfLines = in.nextInt();
        int[][] inputs = new int[amountOfLines][2];
        for (int c1 = 0; c1 < amountOfLines; c1++)
        {
            for (int c2 = 0; c2 < 2; c2++)
            {
                inputs[c1][c2] = in.nextInt();
            }
        }        
        for (int c1 = 0; c1 < amountOfLines; c1++)
        {
            for (int c2 = 0; c2 < 2; c2++)
            {                
                if(c1<amountOfLines-1)
                {      //[ 1 ]   [ 2 ]   [ 3 ]
                    System.out.print("[ "+inputs[c1][c2]+" ]   ");                   
                }                
               else
              {
                  System.out.print("[ "+inputs[c1][c2]+" ] ");
                   if(c2==0)
                  {
                      System.out.print("+ ");
                  }
             } 
            }
            if(c1==amountOfLines-1)
            {
                System.out.print("= ");
            }
            System.out.println("[ "+(inputs[c1][0]+inputs[c1][1])+" ]");  
           
        }
    }
}


