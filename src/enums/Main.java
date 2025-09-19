package enums;

public class Main {
    public static void main(String[] args) {
        Employee alex = new Employee("Alex", WorkStatus.ACTIVE);
        Employee ale2 = new Employee("Alex2", WorkStatus.DISMISS);

        WorkStatus[] statuses = WorkStatus.values();
        for (WorkStatus workStatus : statuses) {
            System.out.println(workStatus);
        }

        printStatus(alex);
        printStatus(ale2);

        WorkStatus workStatus = valueOfIgnoreCase("active");
        System.out.println(workStatus);

       /* WorkStatus workStatus2 = WorkStatus.valueOf("active");
        System.out.println(workStatus2);*/
    }

    public static WorkStatus valueOfIgnoreCase(String workStatus) {
        return WorkStatus.valueOf(workStatus.toUpperCase());
    }

    public static void printStatus(Employee employee) {
        String msg = switch (employee.workStatus()) {
            case ACTIVE -> "Active";
            case DISMISS -> "Dismiss";
        };
        System.out.println("Status " + employee.name() + " status " + msg
                + "\\ status code = " + employee.workStatus().getStatusCode());
    }
}
