import java.util.Scanner ;
public class loob005 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] names=new String[100];
        int i=0;
        String name =sc.nextLine();
        while(!name.equals("*"))
        {
            names[i]=name;
            i++;
            name =sc.nextLine();
        }
        for(int a=0;a<=(i-1);a++)
        {
          System.out.print(names[a]+" ");
        }
    }
    
}
