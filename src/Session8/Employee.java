package Session8;

public class Employee {
    private String name;
    private int age;
    float workPerMonth;
    float salaryPerMonth;

    public Employee(String name, int age, int workPerMonth, int salaryPerMonth) {
        this.name = name;
        this.age = age;
        this.workPerMonth = workPerMonth;
        this.salaryPerMonth = salaryPerMonth;
    }
//    public static int salaryForOneHour(int salaryPerMonth, int workPerMonth) {
//        return salaryPerMonth / workPerMonth;
//    }
    public void setName(String name) {
        System.out.println(this.name);
        this.name = name;
        System.out.println(name);
    }

    public String getName() {
        return this.name;
    }

    public float salaryForOneHour() {
        return salaryPerMonth / workPerMonth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
