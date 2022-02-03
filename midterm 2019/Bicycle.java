public class Bicycle {
    // Fields/variables
    private int gears;
    private double size;
    
    public Bicycle(int gears,double size)
    {
        this.gears=gears;
        this.size=size;
    }
    public double smallestSize(Bicycle mountain)
    {
        if(mountain.size>size)
        {
            return size;
        }
        else
        {
            return mountain.size;
        }
    }
    public boolean isBiggerThan(Bicycle mountain)
    {
        if(mountain.size>size)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    }