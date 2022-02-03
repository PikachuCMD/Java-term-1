 import java.util.Scanner;
 public class card012 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String[] y=x.split("");
        int s=0;
        for(int i=0;i<y.length;i++)
        {
            if(y[i].equals("a") || y[i].equals("e")||y[i].equals("i")||y[i].equals("u")||y[i].equals("o"))
            {
                s++;
            }
        }
        System.out.print(s);

}
}


