import java.util.Objects;

public class Student implements Comparable<Student> {
    private final String name;
    private final String lastName;
    private final int age;
    private final int height;


    public Student(String name, String lastName, int age, int height) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (height != student.height) return false;
        if (!Objects.equals(name, student.name)) return false;
        return Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + height;
        return result;
    }

    @Override
    public int compareTo(Student o) {
        int lastNameComparison =  this.getLastName().compareTo(o.getLastName());
        if(lastNameComparison != 0){
            return lastNameComparison;
        }

        return Integer.compare(getAge(), o.getAge());
    }
}
