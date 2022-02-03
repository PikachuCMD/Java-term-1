import java.util.Scanner; 
public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
       
        String[]y=x.trim().split(" ");
        if(y.length==2){
        
        String b="";
        String c="";      
        for(int i=0;i<y[0].length();i++)
        {
            if(i<1)
            {
                b+=y[0].toUpperCase().charAt(i);
            }
            else{
              b+=y[0].toLowerCase().charAt(i);
            }
        }
        for(int i=0;i<y[1].length();i++)
        {
            if(i<1)
              {
                  c+=y[1].toUpperCase().charAt(i);
              }
              else{
                c+=y[1].toLowerCase().charAt(i);
              } 
        }
       
        System.out.println(b+" "+c);
     
    }
    if(y.length==3){
        
        String b="";
        String c="";      
        for(int i=0;i<y[1].length();i++)
        {
            if(i<1)
            {
                b+=y[1].toUpperCase().charAt(i);
            }
            else{
              b+=y[1].toLowerCase().charAt(i);
            }
        }
        for(int i=0;i<y[2].length();i++)
        {
            if(i<1)
              {
                  c+=y[2].toUpperCase().charAt(i);
              }
              else{
                c+=y[2].toLowerCase().charAt(i);
              } 
        }     
       
        System.out.println(b+" "+c);
     
    }
  
    }
}

