public class Task4 {

    public static void main(String[] args) {
        
        // 10 15 20 22
        // 12 8 10 19
        // 15 11 9 18
        // 17 16+ 14 17
        
    int arr[][]  = {{10,15,20,22},{12,8,10,19},{15,11,9,18},{17,16,14,17}};
		int a = arr[0][0];
		int b = arr[1][0]+arr[0][1];
		int c = arr[2][0]+arr[1][1]+arr[0][2];
		int d = arr[3][0]+arr[2][1]+arr[1][2]+arr[0][3];
		int e = arr[3][1]+arr[2][2]+arr[1][3];
		int f = arr[3][2]+arr[2][3];
		int g = arr[3][3];
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g);
    }

}
