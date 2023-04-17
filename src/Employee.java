public class Employee {

    private String surName;
    private String name ;
    private String patronymic;
    private int salary;
    private int department;

    private static int id = 1;

    public Employee(String surName, String name, String patronymic, int salary, int department) {
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.salary = salary;
        this.department = department;
        id ++;
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

    public static int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary (int salary) {
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
                '}';
    }
}
