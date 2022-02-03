
public class lab001 {
    public static int myPow(int a, int b) {
        int result = 1;
        for (int i = b; i > 0; i--) {
        result *= a;
        return result;
        }
        return result;
        }
        public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int result = myPow(a, b);
        System.out.print(result);
        }
        }