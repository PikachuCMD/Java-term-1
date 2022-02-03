class Car {
    // Variables
    private String model;
    private int speed;

    // Constructor
    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    // Methods
    public  String getModel()
    {
        return model;
    }
    public int getSpeed()
    {
        return speed;
    }
    public boolean isFast()
    {
        if(speed>200)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}