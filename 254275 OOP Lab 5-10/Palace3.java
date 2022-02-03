import java.util.Scanner;
public class Palace3 {
    private int castle;
    private int principality;
    private String owner;
    private String name;
    private String[] x=name.split(" ");

    public Palace3(int castle,int principality,String owner,String name)
    {
        this.castle=castle;
        this.principality=principality;
        this.owner=owner;
        this.name=name;
    }
        public String getOwner()
        {
          
           String[] a=x[0].split("");
           String[] b=x[1].split("");
            String y="";
            String z="";
            for(int i=0;i<a.length;i++)
            {
                if(i<1)
                {
                    y+=a[i].toUpperCase();
                }
                else
                {
                    y+=a[i];
                }
            }
            for(int i=0;i<b.length;i++)
            {
                if(i<1)
                {
                    z+=b[i].toUpperCase();
                }
                else
                {
                    z+=b[i];
                }
            }
            return y+" "+z;
        }
        public String getName()
        {
            return owner;
        }
        public boolean isyourCastle()
        {           
            String z=x[0]+x[1];
            if(z.equalsIgnoreCase("vachirapontosawat") &&  owner.equalsIgnoreCase("java"))
            {
                return true;
            }
            else if(z.equalsIgnoreCase("piyachokseangbuddee") && owner.equalsIgnoreCase("python"))
            {
                return true;
            }
            else if(z.equalsIgnoreCase("nanthaphongkhongyut") && owner.equalsIgnoreCase("kotlin"))
            {
                return true;
            }
            else if(z.equalsIgnoreCase("thadaphongkesornprom") && owner.equalsIgnoreCase("swift"))
            {
                return true;
            }
            else if(z.equalsIgnoreCase("puwanasulklanhun") && owner.equalsIgnoreCase("ruby"))
            {
                return true;
            }
            else if(z.equalsIgnoreCase("panuphuninjan") && owner.equalsIgnoreCase("javascpit"))
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
    public static void main(String[] args)
 {
      Scanner sc = new Scanner(System.in);
        int castle = Integer.parseInt(sc.nextLine());
        int principality = Integer.parseInt(sc.nextLine());
        String owner = sc.nextLine().toLowerCase();
        String name = sc.nextLine().toLowerCase();
        Palace3 p = new Palace3(castle,principality,name,owner);
        if (p.isyourCastle()==true)
        {
          System.out.println(p.getOwner()+" is the owner of the "+p.getName()+" castle.");
        }
        else
        {
          System.out.println(p.getOwner()+" isn't the owner of the "+p.getName()+" castle.");
        }
 }
}
