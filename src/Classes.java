public class Classes {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Peter";
        person1.age = 42;
        System.out.println("My name is " + person1.name + ", " + "and my age is " + person1.age);
        Person person2 = new Person();
        person2.name = "NotPeter";
        person2.age = 20;
        System.out.println("My name is " + person2.name + ", " + "and my Age is " + person2.age);
        }
    }

class Person{
    String name;
    int age;
}
