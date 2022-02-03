import java.util.ArrayList;

public class ArrayLis { 
  public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.set(3, "Opel");
    System.out.println(cars);
  } 
}