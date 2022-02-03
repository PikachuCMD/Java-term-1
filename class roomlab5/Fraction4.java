public class Fraction4 {
    public int num1;
    public int num2;
    public double total;
    public Fraction4(int num1,int num2)
    {
          this.num1=num1;
          this.num2=num2;
    }
    public String toString()
    {
        return num1+"/"+num2;
    }
    public double toDouble()
    {
        return (double)num1/num2;
    }
     public int gcd(int num1,int num2)
     {
         if(num2==0)
         {
                return num1;
         }
         return gcd(num2, num1%num2);
     }
     public void simplify()
     {
         int n= gcd(num1, num2);
         num1=num1/n;
         num2=num2/n;
     }
}
