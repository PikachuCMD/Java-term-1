public class Krispykreme {
    private String branch;
    private String address;
    private String nameofproduct;
    private int amount;
  
    public Krispykreme(String branch, String address, String  nameofproduct , int amount) {
      this.branch = branch;
      this.address = address;
      this.nameofproduct = nameofproduct;
      this.amount=amount;
  
    }
  
    public String getBranch() {
      return branch;
    }
  
    public String getAddress() {
      return address;
    }
  
    public String toString()
    {
      return "Kispy Kreme "+getBranch()+" branch welcome";
    }
    public int getAmount(){
      return this.amount;
    }
  
  }
