import java.util.Scanner;
class Krispykreme1{
    private String branch;
    private String address;

    Krispykreme1(String branch,String address)
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
    public String toString()
    {
        return "Kispy Kreme "+branch+" branch welcome";
    }
    public static void main(String[] args)
    {  
       Krispykreme1 mixxiw = input();
       System.out.println(mixxiw.toString());
    }

    private static Krispykreme1 input()
    {
       Scanner pp = new Scanner(System.in);
       String branch = pp.nextLine();
       String address = pp.nextLine();
       return new Krispykreme1(branch,address);
}
}