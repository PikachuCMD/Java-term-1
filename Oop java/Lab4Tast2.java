import java.util.*;

class Lab4Tast2 {
    public static void main(String[] args) {
        Person personA = inputPerson();
        Person personB = inputPerson();

        if (personA.getAge() == personB.getAge()) {
            System.out.print(personA.getName() + " and " + personB.getName() + " are the same age");
        } else {
            System.out.print(personA.getName() + " and " + personB.getName() + " are NOT the same age");
        }
    }

    private static Person inputPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        Person p = new Person(name, age);
        return p;
    }
}