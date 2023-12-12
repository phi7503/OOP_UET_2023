package javaapplication9;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Doe", 5000.0);
        Employee employee2 = new Employee("Jane", "Smith", 6000.0);

        System.out.println("Employee 1 Yearly Salary: $" + employee1.calculateYearlySalary());
        System.out.println("Employee 2 Yearly Salary: $" + employee2.calculateYearlySalary());

        employee1.raiseSalary(10.0);
        employee2.raiseSalary(10.0);

        System.out.println("\nAfter a 10% raise:");
        System.out.println("Employee 1 Yearly Salary: $" + employee1.calculateYearlySalary());
        System.out.println("Employee 2 Yearly Salary: $" + employee2.calculateYearlySalary());
    }
}
