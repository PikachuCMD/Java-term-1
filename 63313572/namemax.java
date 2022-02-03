import java.util.Scanner;
public class namemax{
    public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("How many people: ");
	 int x=sc.nextInt();
	 String[] y=new String[x];
	 int[] z=new int[x];
	 int max=z[0];
     String namemax=y[0]; 
	 for(int i=0;i<x;i++)
    {
		System.out.println("Person:#"+(i+1));
		System.out.print("Name: ");
		 y[i]=sc.next();
	     System.out.print("Money: ");
		 z[i]=sc.nextInt();
		
	if(max<z[i])
		 {
			 max=z[i];
		 namemax=y[i];

		 }
	}
	System.out.println("name max:"+namemax);
	
}
}
	