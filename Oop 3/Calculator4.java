public class Calculator4 {
    public static double sum(double[] numbers) {
        double sum = 0;
        double y=0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            
        }
        y=sum/numbers.length;
        return y;
}
}
