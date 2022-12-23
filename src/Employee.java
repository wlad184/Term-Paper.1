import java.util.Objects;

public class Employee {
    private String fullName;
    private float salary;
    private int department;
    private int id;
    public static int country = 0;


    public Employee(String fullName, float salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        id = country ++;
    }

    public String getFullName() {
        return fullName;
    }

    public float getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public static int getCountry() {
        return country;
    }


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                ", id=" + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Float.compare(employee.salary, salary) == 0 && department == employee.department && id == employee.id && fullName.equals(employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, salary, department, id);
    }

}
