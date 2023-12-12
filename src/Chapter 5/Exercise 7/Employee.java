package javaapplication9;

public class Employee {

    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setSalary(salary);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(double salary) {
        if (salary < 0.0) {
            this.salary = 0.0;
        } else {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public double calculateYearlySalary() {
        return salary * 12;
    }

    public void raiseSalary(double percent) {
        if (percent > 0.0) {
            salary += salary * (percent / 100.0);
        }
    }
}
