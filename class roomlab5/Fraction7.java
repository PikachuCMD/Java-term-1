class Fraction7
{
    public int top;
    public int bottom;
    public Fraction7(int top, int bottom)
    {
        this.top = top;
        this.bottom = bottom;
    }
    public String toString()
    {
        return top + "/" + bottom;
    }
    public double toDouble()
    {
        return (double)top/bottom;
    }
    public int gcd(int top, int bottom)     //(3,6)
    {
        if (bottom==0)
        {
            return Math.abs(top);
        }
        return gcd(bottom, top%bottom);            //6,3
    }
    public void simplify()
    {
        int n = gcd(top, bottom);
        top = top/n;
        bottom = bottom/n;
    }
    public Fraction7 add(Fraction7 f2)        //for half = f2 = Fraction2
    {
            int n1 = top*3;
            int n2=top*2;
            int total;
            total=n1+n2;
            int n3=bottom*f2.bottom;
          return new Fraction7(total, n3);  
    }
}

