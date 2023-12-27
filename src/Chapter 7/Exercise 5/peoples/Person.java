package peoples;

public class Person {

    public String name;
    public String birthday;

    public Person() {
    }

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", birthday='" + birthday + '\''
                + '}';
    }
}
