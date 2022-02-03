import java.util.*;
public class Lab3Task6 {
    public static void main(String[] args) {
        String[] x=new Scanner(System.in).nextLine().split("");
        String y="";
        String z="";
        for(int i=0;i<x.length;i++)
        {
            if(x[i].equals("a")||x[i].equals("e")||x[i].equals("i")||x[i].equals("o")||x[i].equals("u"))
            {y+=x[i];z+=" ";}
            else{y+=" ";z+=x[i];}            
        }        
        System.out.println(y);
        System.out.println(z);
    }
}
