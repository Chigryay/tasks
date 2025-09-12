package equalsAndHashCode;

public class Example1 {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 12);
        Person Misha = new Person("Misha", 14);
        Person alex3 = alex;
        Person Miha3 = new Person("Misha", 14);
        Person alex2 = new Person("Alex", 12);
        Person Misha2 = new Person("Misha", 14);

        System.out.println(alex.equals(alex3));
        System.out.println(Misha.equals(Misha2));
    }
}
