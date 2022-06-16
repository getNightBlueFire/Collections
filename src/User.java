import java.util.Objects;

public class User {
    private String firstName;
    private String secondName;

    public User(String firstName, String secondName, Integer age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return firstName.equals(user.firstName) && secondName.equals(user.secondName) && age.equals(user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, age);
    }

    @Override
    public String toString() {
        return "User firstName='" + firstName + ", secondName='" + secondName + ", age=" + age + '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
