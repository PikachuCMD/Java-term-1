import java.util.Arrays; 
 
public class Arraysort
{ 
public static void main(String[] args) 
    { 
        //define an array
        int[] intArray = {52, 45, 32, 64, 12, 87, 78, 98, 23, 7}; 
 
        System.out.print("Original Array : %s", Arrays.toString(intArray)); 
 
        Arrays.sort(intArray); 
 
        System.out.print("Sorted Array : %s", Arrays.toString(intArray)); 
    } 
}