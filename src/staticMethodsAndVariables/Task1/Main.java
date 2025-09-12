package staticMethodsAndVariables.Task1;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(new Employee("ALex", "manager"));
        }

        System.out.println(Employee.getCountEmployee());
    }
}
