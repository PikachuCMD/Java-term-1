public class DSG
{
    private  String name;
    private  int age;
    private  String Distinction;
    private  int RankingsGarder;

    public  DSG (String name , int age , String Distinction , int RankingsGarder)
    {
       this.name = name;
       this.age  = age;
       this.Distinction = Distinction;
       this.RankingsGarder = RankingsGarder;

    }

    public String getName()
    
    {
      return name;
    }
    public int getAges()
    {
      return age;
    }

    public String getDistinction()
    {
      return Distinction;
    }

    public int getRankingsGarder()
    {
      return RankingsGarder;
    }

    public String toString()
    {
      String  wish = "May you have many more joyous days. \n  I hope you get grade A \nI wish you all the best on your day! \n May this birthday be the beginning of the best years of your life \n  May your life be colorful \n May the joy that you have spread in the past come back to you on this day. Wishing you a very happy birthday!";
      return wish;
    }

}