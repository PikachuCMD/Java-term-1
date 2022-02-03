public class Calc {
    public static void main(String[] args) {
        int[] input1={5,3,-2};
        int output1=Calc.positiveSum(input1);
        int[] input2={-4,-9,2,1,6};
        int output2=Calc.positiveSum(input2);
        System.out.print("Output: "+output1+", "+output2); 
    }

    int positiveSum(int a[])
    {
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                s+=a[i];
            }
        }
        return s;
    }
}
