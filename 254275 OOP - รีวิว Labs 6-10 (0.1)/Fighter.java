public class Fighter extends Aeroplane
{
    private int maximumWeaponsWeight;

    public Fighter(String model,int engine ,int seats,int maximumWeaponsWeight)
    {
        super(model, engine, seats);
        this.maximumWeaponsWeight=maximumWeaponsWeight;
    }
    public int maximumWeaponsWeight()
    {
        return maximumWeaponsWeight;
    }
    public boolean canCarry(int a)
    {
        if(maximumWeaponsWeight>a)
        {
            return true;
        }
        else
        {
           return false;
        }
    }
}
