public class Task {
    public static void main(String[] args) {
        Brand a=new Brand("levis");
        Brand b=new Brand("levis");
        Brand c=new Brand("levis");
        Brand []brand={a,b,c};
        Q101 q101=new Q101("card", "card", brand);
        System.out.print(q101.toString());
    }
}
