public class Calc {
    public static void main(String[] args) {
        int[] input1 = { 5, 3, 15, -6};
        int output1 = Calc.maximum(input1); // 15
        int[] input2 = {-4, -2, -5, -9 };
        int output2 = Calc.maximum(input2); // -2
        System.out.println("Outputs: " + output1 + ", " + output2);
        }

    public static int maximum(int[] x)
     {
        int max=x[0];
        for(int i=0;i<x.length;i++)
        {
            if(max<x[i])
            {
                max=x[i];
            }
        }
        return max;
     }
}
/*
String x="card";
boolean y=true;
double b=1.0;
int n=1;
float f=1.20345234342f;
long l=234829342798472l;
char c='c';
*/
