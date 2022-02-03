public class equalsIgnoreCase
{  
    public static void main(String args[])
    {  
      String in1="java";  
      String in2="java";  
      String in3="JAVA";  
      String in4="Javaa";  
      System.out.println(in1.equalsIgnoreCase(in2));
      System.out.println(in1.equalsIgnoreCase(in3));
      System.out.println(in1.equalsIgnoreCase(in4)); 
    }
}