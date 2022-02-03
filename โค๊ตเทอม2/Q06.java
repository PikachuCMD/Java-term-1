import java.util.Scanner; 
public class Q06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          String[] x=sc.nextLine().split("");
          for(int i=0;i<x.length;i++)
          {
              if(i<x.length-1)
              {
          System.out.print(x[i]+",");
              }
              else
              {
          System.out.print(x[i]);
              }
          }
          /*String input = new Scanner(System.in).nextLine();
        char[] chars = input.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars)
        {
          charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet)
        {
          sb.append(character);
        }
        for (int i=0;i<sb.length();i++)
        {
          if(i<sb.length()-1)
          System.out.print(sb.charAt(i)+",");
          else
          System.out.print(sb.charAt(i));*/
        }
          
    }

