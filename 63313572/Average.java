import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        double[] z = new double[10000]; 
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();// ค่าสิ้นสุด
        double y=0;
        for(int i=0;i<n;i++)
        {  //วนรับค่า
            double x = sc.nextDouble();   //รับค่า
             z[i] = x;  //รับค่าใส่อาเร 
             y+=z[i]; //ผลรวม
             
        }
        double A = y/n;  //ค่าเฉลี่ย
        System.out.println("Average : " + A);
        for(int i=0;i<z.length;i++)  //วนเทียบค่า
        {
            if(z[i]>A){
                System.out.println(z[i]);
            }
        }
    }
}