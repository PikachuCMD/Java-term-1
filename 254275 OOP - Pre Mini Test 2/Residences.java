import java.util.Scanner;
public class Residences {
     private String name;
     private int tr;
     private int tf;
     private String address;
     private String nameresidence;
     private int sumoffloor;
     private int ckf;
    Residences(String name,int tr,int tf,String address,String nameresidence,int sumoffloor,int ckf)
    {
       this.name=name;
       this.tr=tr;
       this.tf=tf;
       this.address=address;
       this.nameresidence=nameresidence;
       this.sumoffloor=sumoffloor;
       this.ckf=ckf;
    }
    String getName()
    {
        return name;
    }
    int getTotalofroom()
    {
        return tr;
    }
    int getTotaloffloor()
    {
        return tf;
    }
    String getAddress()
    {
        return address;
    }
    String getNameResidence()
    {
        return nameresidence;
    }
    int getSumoffloor()
    {
        return sumoffloor;
    }
       
    public static void main(String[] args)
    {
        Residences Benzalert = input();
        System.out.print("This hotel name is " + Benzalert.getName() + " has ");
        System.out.print(Benzalert.getTotalofroom() + " rooms in this hotel and they have ");
        System.out.println(Benzalert.getTotaloffloor() + " Floors");
        System.out.println("The location of this hotel is in "+Benzalert.getAddress());
        System.out.println("And the Hotel has Residences name is "+Benzalert.getNameResidence()+" They have "+Benzalert.getSumoffloor()+" Floors");
    }

    public static Residences input()
    {
      Scanner kb = new Scanner(System.in);
      String name = kb.nextLine();
      int tr = Integer.parseInt(kb.nextLine());
      int tf = Integer.parseInt(kb.nextLine());
      String address =  kb.nextLine();
      String  nameresidence = kb.nextLine();
      int sumoffloor = Integer.parseInt(kb.nextLine());
      int ckf = kb.nextInt();
      return new Residences(name,tr,tf,address,nameresidence,sumoffloor,ckf);
    }
}
