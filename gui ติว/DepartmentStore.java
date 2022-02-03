public class DepartmentStore extends Shop
{
    private Brand[] brand;

    DepartmentStore(String name,String locaation,Brand[] brand)
    {
        super(name, location);
        this.brand=brand;
    }
    Brand[] getBrands()
    {
        return brand;
    }
    int numberOfBrands()
    {
        return brand[i];
    }
}
