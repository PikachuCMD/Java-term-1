import java.util.Scanner;
public class Task003 {
    
        public static void main(String[] args) {
        Account acc = new Account("A", 0.0);
        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.print("Enter amount: ");
        String input = scanner.nextLine();
        int amount = Integer.parseInt(input);
        acc.deposit(amount);
        System.out.println("Balance is "+acc.getBalance());
        }
        }
        }
    
