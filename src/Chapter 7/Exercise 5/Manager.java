
import peoples.Employee;

public class Manager extends Employee {

    private Employee assistant;

    public Manager() {
    }

    public Manager(String name, String birthday, double salary, Employee assistant) {
        super(name, birthday, salary);
        this.assistant = assistant;
    }

    public Employee getAssistant() {
        return assistant;
    }

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", birthday='" + getBirthday() + '\'' +
                ", salary=" + getSalary() +
                ", assistant=" + assistant +
                '}';
    }
}

