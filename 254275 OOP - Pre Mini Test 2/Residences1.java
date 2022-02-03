import java.util.Scanner;
public class Residences1 {
     private String name;
     private int tr;
     private int tf;
     private String address;
     private String nameresidence;
     private int sumoffloor;
     private int ckf;
    Residences1(String name,int tr,int tf,String address,String nameresidence,int sumoffloor,int ckf)
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
    int getCkf()
    {
        return ckf;
    } 
       String myRoom()
      {
          if(ckf==4)
          {
              return ckf+"th floor\nThe Garden Loft\nGame Room\nPriavte Dining Room\nSwimming pool";
          }
          else if(ckf==36)
          {
              return ckf+"th floor\nThe Oriental Salon(Sky Lounge)\nCommunal Kitchen Area\nLibrary and office\nBall Room";
          }
          else if(ckf==5)
          {
            return ckf+"th floor\nGym & Fitness";
          }
          else //if(ckf==1)
          {
            return ckf+"th floor\nLobby";
          }
         
      }      
    public static void main(String[] args)
    {
        Residences1 Benzalert = input();
       System.out.println(Benzalert.myRoom());
    }

    public static Residences1 input()
    {
      Scanner kb = new Scanner(System.in);
      String name = kb.nextLine();
      int tr = Integer.parseInt(kb.nextLine());
      int tf = Integer.parseInt(kb.nextLine());
      String address =  kb.nextLine();
      String  nameresidence = kb.nextLine();
      int sumoffloor = Integer.parseInt(kb.nextLine());
      int ckf = kb.nextInt();
      return new Residences1(name,tr,tf,address,nameresidence,sumoffloor,ckf);
    }
}
