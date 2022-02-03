public class Smartwatch extends Watch4{
    private String operatingSystem;
    Smartwatch(String name,String colour,int price,String operatingSystem)
    {
        super(name,colour,price);
        this.operatingSystem=operatingSystem;
    }
    public String getOperatingSystem()
    {
        return operatingSystem;
    }
}
