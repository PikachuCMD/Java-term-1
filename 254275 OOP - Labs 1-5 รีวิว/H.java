import java.util.Scanner;
class H {

    public static void main(String[] args) {
        String[] words = stringArray();
        String result = longWord(words);
        System.out.println(result);
    }   public static String[] stringArray()
    {
        Scanner sc=new Scanner(System.in);
        String[] x=sc.nextLine().split(",");
            return x;
    }
    public static String longWord(String [] args)
    {
       String x="";
        for(int i=0;i<args.length;i++)
        {
               if(6<args[i].length())
               {
                 x+= args[i];
                    break;
               }
        } 
        return x;
    }

  
}