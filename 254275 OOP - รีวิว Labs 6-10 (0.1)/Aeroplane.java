public class Aeroplane {
    private String model;
    private int engine;
    private int seats;

    public Aeroplane(String model,int  engine,int seats)
    {
        this.model=model;
        this.engine=engine;
        this.seats=seats;
    }
    public String getModel()
    {
        return model;
    }
    public int getEngines()
    {
        return engine;
    }
    public int getSeats()
    {
        return seats;
    }
    public String toString()
    {
        return model+ " ("+seats+" seats)"; 
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
