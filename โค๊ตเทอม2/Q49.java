import java.util.Scanner;
public class Q49
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String inputs = in.nextLine();
        String[] arrStrOfInputs = inputs.split(",");
        int[] arrIntOfInputs = new int[arrStrOfInputs.length];
        for (int counter =0; counter<arrIntOfInputs.length;  counter++)
        {
            arrIntOfInputs[counter] = Integer.parseInt(arrStrOfInputs[counter]);
        }
        String total = "[";
        for(int i = 0; i < arrIntOfInputs[0]; i++)
        {
            for(int j = 0; j < arrIntOfInputs[1]; j++)
            {
                if (j == arrIntOfInputs[1]-1)
                {
                    total+=j*i;
                }
                else
                {
                     total+=j*i +",";
                }
            }
            if (i == arrIntOfInputs[0]-1)
            {
               total+="]";
                break;
            }
            else
            {
               total+="]"+","+"[";
            }
        }
        System.out.print(total);
    }
}