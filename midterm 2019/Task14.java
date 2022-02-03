public class Task14 {
    public static void main(String[] args) 
    {
        
    
    Bicycle racer = new Bicycle(5, 17.5);
Bicycle mountain = new Bicycle(21, 19.0);
double size = racer.smallestSize(mountain);
System.out.print(size);
}
}