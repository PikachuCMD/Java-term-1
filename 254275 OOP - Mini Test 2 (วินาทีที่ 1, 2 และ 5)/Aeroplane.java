public class Aeroplane {
    private String model;
    private int engines;
    private int seats;

    public Aeroplane(String model,int engines,int seats)
    {
        this.model=model;
        this.engines=engines;
        this.seats=seats;
    }
    public String getModel()
    {
        return model;
    }
    public int getEngines()
    {
        return engines;
    }
    public int getSeats()
    {
        return seats;
    }
    public String toString()
    {
        return model+" ("+seats+" seats)";
    }
    public boolean isJumbo()
    {
        if(seats>250)
        {
            return true;
        }
        else
        {
             return false;
        }
    }


}
