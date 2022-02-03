import java.util.Scanner;
public class D
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String pp = in.nextLine();
		if (pp.equalsIgnoreCase("monday")) 
		{
			System.out.println("Yellow");	
		}
		else if (pp.equalsIgnoreCase("tuesday")) 
		{
			System.out.println("Pink");
		}
		else if (pp.equalsIgnoreCase("wednesday")) 
		{
			System.out.println("Green");
		}
		else if (pp.equalsIgnoreCase("thursday")) 
		{
			System.out.println("Orange");
		}
		else if (pp.equalsIgnoreCase("friday")) 
		{
			System.out.println("Blue");
		}
		else if (pp.equalsIgnoreCase("saturday")) 
		{
			System.out.println("Purple");
		}
		else
		{
			System.out.println("Red");
		}
	}
}