import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] x=sc.nextLine().split(",");
		String[] y=sc.nextLine().split("");
		int a=Integer.parseInt(x[0]); //total
		int b=Integer.parseInt(x[1]);  //uppercase
		int c=Integer.parseInt(x[2]);   //lowercase
		int d=Integer.parseInt(x[3]);    //numeric
		int n=0;
		int f=0;
		int v=0;	
		for(int i=0;i<y.length;i++)
		{
			if(y[i].matches("^[0-9].*")){n++;}
			if (y[i].matches(".*[a-z].*")){f++;}
			if((y[i].matches("^[A-Z]*$"))){v++;}
		}		
		if(y.length<a){System.out.println("total");}		
		if(v<b){System.out.println("uppercase");}
	    if(f<c){System.out.println("lowercase");}
		if(n<d){System.out.println("numeric");}		
		if(y.length>=a&& v>=b && f>=c && n>=d ){System.out.println("correct");} 
		
	}
}
		
		