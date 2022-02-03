import java.util.Scanner;
public class F {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String room;
        int numroom;
    
        do {
            room = in.nextLine().toLowerCase().replace("where is ", "");
            if (room.equals("bye")) break;
            numroom = Integer.parseInt(room);
            if (numroom >= 101 && numroom <= 118) {System.out.println("Floor 1");}
            else if (numroom >= 201 && numroom <= 218) {System.out.println("Floor 2");}
            else if (numroom >= 301 && numroom <= 318) {System.out.println("Floor 3");}
            else if (numroom >= 401 && numroom <= 418) {System.out.println("Floor 4");}
            else if (numroom >= 501 && numroom <= 518) {System.out.println("Floor 5");}
            else {System.out.println("Invalid room");}
        } while (true);
    }
}