public class Smartwatch1 extends Watch5{
    private String operatingSystem;
    Smartwatch1(String name,String colour,int price,String operatingSystem)
    {
        super(name,colour,price);
        this.operatingSystem=operatingSystem;
    }
    public String getOperatingSystem()
    {
        return operatingSystem;
    }
    boolean isAppleWatch()
    {
        if(operatingSystem.contains("WatchOS"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
