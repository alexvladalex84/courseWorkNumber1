import java.util.Objects;

public class Employee {

    private String surName;
    private String name;
    private String patronymic;
    private int salary;
    private int department;

    private final int id;
    public static int idCounter = 0;

    public Employee(String surName, String name, String patronymic, int salary, int department) {
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.salary = salary;
        this.department = department;
//        counter = counter + 1;
//        id = ++counter;
        this.id = idCounter++;
//        System.out.println(id);
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && department == employee.department && Objects.equals(surName, employee.surName) && Objects.equals(name, employee.name) && Objects.equals(patronymic, employee.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surName, name, patronymic, salary, department);
    }
}







