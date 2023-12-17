
import peoples.Employee;
import peoples.Person;

public class PeopleTest {

    public static void main(String[] args) {
        // Tạo các đối tượng
        Person person1 = new Person("Nguyễn Văn A", "01/01/1990");
        Employee employee1 = new Employee("Trần Thị B", "02/02/1991", 100000000);
        Manager manager1 = new Manager("Lê Quang C", "03/03/1992", 200000000, employee1);

        // Tạo mảng kiểu Person
        Person[] people = new Person[3];
        people[0] = person1;
        people[1] = employee1;
        people[2] = manager1;

        // In thông tin các đối tượng trong mảng
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
