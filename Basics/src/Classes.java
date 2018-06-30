class Person {
    String name;
    int age;

//    public void speak(boolean bool) {
    void speak(boolean bool) {
        if (bool) {
            System.out.println("Hello, my name is " + name + ". I am " + age + " years old!");
        } else {
            System.out.println("Hello, my name is not " + name + ". I am not " + age + " years old!");
        }
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}

public class Classes {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Wahid Bawa";
        person1.age = 16;

        Person person2 = new Person();
        person2.name = "Yoh";
        person2.age = 16;

        System.out.println(person1.getName() + " " + person1.getAge());
        System.out.println(person2.getName() + " " + person2.getAge());

        person1.speak(true);
        person2.speak(true);
    }
}
