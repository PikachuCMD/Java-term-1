import java.util.Scanner;    
public class Task1B
{
    public static void main(String[] args)
	{
 	    ArrayCollection mydata = new ArrayCollection(500);
 	 	  Object d = input();
 		   mydata.add(d);
		   for(int i=1;i<=4;i++)
		   {
	        mydata.add(input());
	       }
 		    System.out.println(mydata.size());
     }
     private static Object input()
	 {
       Scanner in = new Scanner(System.in);
       String s = in.nextLine();
       return s;
     }
}


