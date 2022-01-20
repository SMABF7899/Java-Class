package Session8;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Seyed Mohammad Ali Bani Fatemi", 23, 200, 3000000);
        System.out.println(employee.salaryPerMonth / employee.workPerMonth);
        //System.out.println(Employee.salaryForOneHour(employee.salaryPerMonth, employee.workPerMonth));
        System.out.println(employee.salaryForOneHour());
        employee.setName("Bani");
        System.out.println(employee);
        employee.getName();
    }
}
