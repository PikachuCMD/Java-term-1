public class edit001 {
    public static void main(String[] args) {
            String a = new String("This,year,2013,Welcome to,ThaiCreate.Com,Version 2013");
            String[] arrB = a.split(",");
        for(String c : arrB)
    {
        System.out.print(c);
        }
        System.out.println("======================");
       for(int i = 0; i<arrB.length; i++)
        {
        System.out.print(arrB[i]);
        }        
        }         
        }