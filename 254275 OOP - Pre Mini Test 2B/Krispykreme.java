import java.util.Scanner;
class Krispykreme{
    private String branch;
    private String address;

    Krispykreme(String branch,String address)
    {
        this.branch=branch;
        this.address=address;
    }
    String  getBranch()
    {
        return branch;
    }
    String getAddress()
    {
        return address;
    }
    public static void main(String[] args)
    {  
       Krispykreme mixxiw = input();
       System.out.println("Krispykreme "+mixxiw.getBranch()+" Branch Location "+mixxiw.getAddress());
    }

    private static Krispykreme input()
    {
       Scanner pp = new Scanner(System.in);
       String branch = pp.nextLine();
       String address = pp.nextLine();
       return new Krispykreme(branch,address);
}
}