public class DonutBox {
    Donut donutList[] = new Donut[10];
    int count = 0;
   
    void  putDonut(Donut p)
    {
       donutList[count]=p;
        count++;
    }
    double getTotalPrice()
    {
        double sum=0;
        for(int i=0;i<count;i++)
        {
              sum=sum+donutList[i].getPrice();
        }
        return sum;
    }
   
}