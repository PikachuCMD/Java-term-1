
public class Lab6Task41 {
    public static void main(String[] args) {
     int[] x={1,2,4,5,3};
     double[] y={1.2,3.4,5.0,4.3,2.1};
      double n=sum(x,y);
      System.out.print(n);
    }
    public static double sum(int[] a,double[] b)
    {
        double n=0;
        for(int i=0;i<a.length;i++)
        {
            n+=a[i];
            n+=b[i];
        }
        return n;
    }
}
