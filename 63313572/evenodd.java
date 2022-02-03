import java.util.*;
public class evenodd {
public static void main(String[] args) {
    Scanner kai = new Scanner(System.in);
    int even=0;
    int odd =0;
    for(int x = 0;x<10;x++){
        int y = kai.nextInt();
        if (y%2==0){
            even++;
        }
        else{
            odd++;
        }

    }
    System.out.println(even);
    System.out.println(odd);
}
    
}
