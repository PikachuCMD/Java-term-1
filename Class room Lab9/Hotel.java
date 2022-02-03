public class Hotel extends Place{
    int num;
    Hotel(String name, String address, String province, int num)
    {
        super(name, address, province);
        this.num=num;
    }
    int calculatePrice(int n)
    {
         n=n*num;
        return n;
    }
    int calculatePrice(int a,int b)
    {
        int x=(a*num)*b;
        return x;
    }
}
