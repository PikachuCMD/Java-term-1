import java.util.Scanner;
class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Seat seat = new Seat(sc.nextLine(), sc.nextInt());
        System.out.print("The " + seat.getColour() + " seat can sit " + seat.getMaxPeople() + " people - ");
        if (seat.isSofaOrBench()) {
            System.out.println("it's a sofa!");
        }
        else {
            System.out.println("not a sofa!");
         }
    }
}