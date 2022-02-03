import java.util.Scanner ;
public class number02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();        
        int[] num=new int[x.length()];     
        double g=0;
        for(int i=0;i<num.length;i++)
                  {
                    num[i]=Integer.parseInt(x.charAt(i));
                  }
        for(int i=0;i<num.length;i++){          
              g+=num[i]+Math.pow(2, i);

        }
        System.out.print(g);
    }
}
