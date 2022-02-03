public class Fraction2 {
    
    public int number1;
    public int number2;
     
    public Fraction2(int number1,int number2)
    {
       this.number1=number1;
       this.number2=number2;
    }
    public String toString()
    {
        return number1+"/"+number2;
    }
    public double toDouble()
    {
        return (double)number1/number2;
    }
}
