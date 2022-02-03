public class tast0003 {
    public static void main(String args[]) {
        String Str = new String("Welcome-to-w3big.com");

        System.out.println("name :" );
        for (String retval: Str.split("-", 2)){
            System.out.println(retval);
        }
        System.out.println("");
        System.out.println("name :" );
        for (String retval: Str.split("-", 3)){
            System.out.println(retval);
        }
        System.out.println("");
        System.out.println("name :" );
        for (String retval: Str.split("-", 1)){
            System.out.println(retval);
        }
        System.out.println("");
        System.out.println("name :" );
        for (String retval: Str.split("-")){
            System.out.println(retval);
        }
    }
}