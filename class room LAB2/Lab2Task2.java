
public class Lab2Task2 {
    public static void main(String[] args) {
        String x="";
        for(int i=1;i<=100;i++)
        {
              if(i%3==0)
              {
                  x+="Fizz,";
              }
              else if(i%5==0)
              {
                  x+="Buzz,";
              }
              else
              {
                  x+=i+",";
              }
        }
        System.out.print(x);
    }
}
