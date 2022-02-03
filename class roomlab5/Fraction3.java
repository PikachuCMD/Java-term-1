public class Fraction3 {
    public int num1;
    public int num2;

    public Fraction3 (int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;

    }
    public boolean equals(Fraction3 obj)
    {
        if(num1 == obj.num1 && num2== obj.num2)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
