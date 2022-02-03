import java.util.*;
class TaskB {

    public static void main(String[] args) {
        String[] words = inputStringArray();
        String result = longWord(words);
        System.out.println(result);
    }

    private static String[] inputStringArray() {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        String[] result = input.split(",");
        return result;
    }

    public static String longWord(String[] x)
    {
        String s="";
       for(int i=0;i<x.length;i++)
       {
           if(x[i].length()>6)
           {
               s+=x[i];  
               break;            
           }
       }
       return s;
    }
}