import java.util.Scanner;

public class PrimeNumber {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      boolean prime = true;
      System.out.print("Input number to check Prime Number : ");
      int number = scan.nextInt(); // รับค่าที่ต้องการตรวจสอบจำนวนเฉพาะผ่านคีบอร์ด
      int limit = (int) Math.sqrt(number); // จำนวนสุดท้ายใช้หารเพื่อตรวจสอบจำนวนเฉพาะ
      
      for (int i = 2; i <= limit; i++) { // วนลูปตรวจสอบจำนวนเฉพาะเริ่มต้นที่ 2 ถึงจำนวนสุดท้าย
         if (number % i == 0) { // ถ้ามีตัวไหนหารลงตัวแสดงว่าไม่ใช้จำนวนเฉพาะ
            prime = false;
            break;
         }
      }

      System.out.println(number + " is prime = " + prime);
   }
}