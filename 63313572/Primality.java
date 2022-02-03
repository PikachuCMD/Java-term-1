import java.util.Scanner;
// โปรแกรมทดสอบว่าจำนวนเต็มที่ได้รับเป็นจำนวนเฉพาะหรือไม่ 
public class Primality {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("n = ");
    int n = kb.nextInt();
    int k = 2;                  // ลองหารด้วย k = 2, 3, ..., n-1
    while (true) {
      if (k >= n) break;        // หลุดจากวงวนเมื่อลองหารครบทุกตัวแล้ว 
      if ((n % k) == 0) break;  // หลุดจากวงวนเมื่อพบ k ที่หาร n ลงตัว 
      k++;
    }
    System.out.println(k == n); // ถ้า k เท่ากับ n แสดงว่า n เป็นจำนวนเฉพาะ 
  }
}