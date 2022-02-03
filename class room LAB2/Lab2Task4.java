public class Lab2Task4 {
    public static void main(String[] args) {
        String x="This is the way it is.";
        String y =countVowels(x);
        System.out.print("The Stirng \""+x+"\" has "+ y+" vowels");

    }
    public static String countVowels(String x)
    {
        int h=0;
        String y="";
        for(int i=0;i<x.length();i++)
        {
           if(x.charAt(i)=='a'|| x.charAt(i)=='e'||x.charAt(i)=='i'||x.charAt(i)=='o'||x.charAt(i)=='u')
           {
               h++;
           }           
        }
              y+=h;
        return y;
    }
}
