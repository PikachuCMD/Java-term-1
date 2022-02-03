class Fraction5
{
    public int top;
    public int bottom;
    public Fraction5(int top, int bottom)
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
    public Fraction5 multiply(int multiply)        //for multiply
    {
        return new Fraction5(top * multiply,bottom);
    }
}