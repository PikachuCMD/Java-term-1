
public class Lab4Tast3 {
    public static void main(String[] args) {

        Person person = new Person("card", 18);
        System.out.println("Now you are" + person.getAge() + "."); // 18
        person.increaseAge();
        System.out.println("Soon you will be " + person.getAge() + "."); // 18

    }
}
