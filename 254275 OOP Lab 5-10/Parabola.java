import java.util.Scanner;
public class Parabola {
    private double a;
    private double b;
    private double c;
 
    public Parabola(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
     double getLatusrectum(double c)
     {
       double latusrectum =  (c/4);
       return latusrectum;
     }
     double getVertexa(double a,double b)
     {
         double Vertera = (-b / (2 * a));
         return Vertera;         
     }
     double getVertexb(double a,double b,double c)
     {
        double Verterb =(((4 * a * c) - (b * b)) / (4 * a));
        return Verterb ;
     }
     double getFocusa(double a,double b)
     {
         double Focusa=  (-b / (2 * a));
         return Focusa;
     }
     double getFocusb(double a,double b,double c)
     {
         double  Focusb=  (((4 * a * c) - (b * b) + 1) / (4 * a));
         return Focusb;
     }
     double getDirectrix(double a,double b,double c)
     {
        double Directrix= (int)(c - ((b * b) + 1) * 4 * a);
        return Directrix;
     }
    public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    double a = in.nextDouble();
    double b = in.nextDouble();
    double c = in.nextDouble();
    Parabola x = new Parabola(a,b,c);
    System.out.println("Latus Rectum = "+"+- "+String.format("%.2f",x.getLatusrectum(c)));
    System.out.println("Vertex: ("+String.format("%.2f",x.getVertexa(a,b))+","+String.format("%.2f",x.getVertexb(a,b,c))+")");
    System.out.println("Focus : ("+String.format("%.2f",x.getFocusa(a,b))+","+String.format("%.2f",x.getFocusb(a,b,c))+")");
    System.out.println("Directrix: y = "+String.format("%.2f",x.getDirectrix(a,b,c)));
}
}
