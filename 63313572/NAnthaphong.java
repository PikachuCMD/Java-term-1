public class NAnthaphong extends Charb
{
    private int dynasty;

    public NAnthaphong(String name, int age,  int dynasty)
    {
        super(name, age);
        this.dynasty = dynasty;
    }

    public  boolean isDynasty(int F)
    {
        if (dynasty == 5)
        {
          return true;
        }
        else
        {
          return false;
        }
    }
}