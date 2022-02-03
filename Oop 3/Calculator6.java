public class Calculator6 {
    
        public static int sum(int[] numbers) 
        {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) 
            {
                sum = sum + numbers[i];
            }
          
            return sum;
        }
    
        public static double sum(double[] numbers) 
        {
            double sum = 0;
          
            for (int i = 0; i < numbers.length; i++)
            {
                sum = sum + numbers[i];
            }
            return sum;
        }
    
        public static double sum(int[] a1 ,double[] b2) 
        {
            return Calculator5.sum(a1)+Calculator5.sum(b2);
            
        }
        public static double sum(double[] a1 ,int[] b2) 
        {
            return Calculator5.sum(a1)+Calculator5.sum(b2);
            
        }
    }
     

