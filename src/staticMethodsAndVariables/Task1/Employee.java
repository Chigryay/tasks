package staticMethodsAndVariables.Task1;

public class Employee {
    private String name;
    private String position;
    private final int ID;
    private static int countEmployee = 0;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
        this.ID = countEmployee;
        countEmployee++;
    }

    public static int getCountEmployee() {
        return countEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", position='" + position + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
