package Session9;

public class Employee {
    private String firstName;
    private String lastName;
    private int monthlySalary;

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int annualSalaryIncrease (int percent) {

        return (this.monthlySalary * 1 / (percent));
    }
}
