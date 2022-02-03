public class Restaurant extends Place{
    String foodType;
    Restaurant(String name ,String address, String province, String foodType)
    {
        super(name, address, province);
        this.foodType=foodType;
    }
    public String getFoodType() {
        return foodType;
    }
    boolean isThaiFood()
    {
       if(foodType.equals("Thai"))
       {
           return true;
       }
       return false;
    }
    boolean hasSameFoodType(Restaurant r2)
    {
       if(r2.getName().equals(name))
       {
           return true;
       }
       return false;
    }
    String getAttractionType()
    {
        return foodType;
    }
}
