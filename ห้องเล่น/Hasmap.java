import java.util.HashMap;

public class Hasmap {

    public static void main(String[] args) {

        // Creating map object
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        // Adding data to map
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        // Determine map's size
        System.out.println("Size: " + map.size());

        // Retrieving data from map
        System.out.println("apple: " + map.get("apple"));
        System.out.println("banana: " + map.get("banana"));
        System.out.println("something: " + map.get("something"));

    }
}