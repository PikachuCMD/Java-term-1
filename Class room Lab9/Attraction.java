public class Attraction extends Restaurant{
    int num;
    Attraction(String name ,String address,String province,String foodType,int num)
    {
        super(name, address, province, foodType);
        this.num=num;
    }
    int getEntryTicketPrice()
    {
        return num;
    }
    boolean isFreeEntry()
    {
        if(num==0)
        {
            return true;
        }
        return false;
    }
}
