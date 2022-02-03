import java.util.*;

public class Q29 {
  public static void main(String[] args) {
    String[] x = new Scanner(System.in).nextLine().split(" ");
    int[] y = new int[x.length];
    for (int i = 0; i < x.length; i++) {
      y[i] = Integer.parseInt(x[i]);
    }
    if (nn(y)) {
      System.out.print(true);
    } else {
      System.out.print(false);
    }
  }

  public static boolean nn(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + i] == 3) {
        return true;
      }
    }
    return false;
  }
}
/*
 * private static boolean arrayOneTwoThree(int[] nums)
 * {
 * boolean result = false;
 * int counter = 0,index = 0;
 * int arr[] = {1,2,3};
 * // base condition check. like array length should not be less than 3.
 * if(nums.length < 3)
 * {
 * return result;
 * }
 * //for loop for iterating over array and finding desired pattern
 * for(int i = 0; i < nums.length; i++)
 * {
 * //pattern found in array
 * if(counter == 3)
 * {
 * result = true;
 * return result;
 * }
 * if(nums[i] == arr[counter])
 * {
 * index++;
 * counter++;
 * }
 * else if(counter != 0)
 * {
 * i = index-1;
 * counter = 0;
 * }
 * }
 * if (counter == 3)
 * {
 * result = true;
 * return result;
 * }
 * return result;
 * }
 */