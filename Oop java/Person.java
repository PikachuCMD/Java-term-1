public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int increaseAge() {
        age = age + 1;
        return age;
    }

    public String toString() {
        name += " " + "(" + age + ")";
        return name;
    }

    public boolean equals(Person obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != obj.getClass()) {
            return false;
        }
        Person geek = (Person) obj;
        return (geek.name == this.name && geek.age == this.age);
    }
}
