public class Q10  {
    private String a;
    private double b;

  public Q10(String a,double b)
    {
        this.a=a;
        this.b=b;
    }
    public int getBalance()
    {
        return (int)b;
    }
    String getName()
    {
        return a;
    }
    public void withdraw(double amount)
    {
      if(amount > 0&& amount<=b)
      {
          b=b-amount;
      }
    }
    boolean isGreater(double e)
    {
        if(e<b)
        {
           return true;
        }
        return false;
    }
    static String greatestBalance(Q10 a,Q10 b)
    {
       if(a.getBalance()>b.getBalance())
       {
           return a.getName();
       }
       else 
       {
           return b.getName();
       }
    }
}
