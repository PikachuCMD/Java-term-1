import java.util.Scanner;
public class card008 {
    public static void main(String[] args) 
    {
        String str=new Scanner(System.in).nextLine();
        int spaces =str ==null ? 0 : str.replaceAll("[^ ]", "").length();
        System.out.println(spaces); 

    }

    
}
