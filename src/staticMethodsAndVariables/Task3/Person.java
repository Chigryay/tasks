package staticMethodsAndVariables.Task3;

public class Person {
    private String name;
    private int age;

    private static int id = 1;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        print();
    }

    static {
        System.out.println("static-1");
    }

    private void print() {
        System.out.println("Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}');
    }
}
