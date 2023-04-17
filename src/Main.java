public class Main {

    public static void main(String[] args) {
        Employee employeemas[] = new Employee[5];

        Employee employee1 = new Employee("Александров", "Александр", "Владимирович", 300000, 1);
        employeemas[0] = employee1;


        Employee employee2 = new Employee("Андреев ", "Андрей", "Андреевич", 100000, 2);
        employeemas[1] = employee2;

        Employee employee3 = new Employee("Попов ", "Евгений", "Сергеевич", 55000, 3);
        employeemas[2] = employee3;

        Employee employee4 = new Employee("Сомов ", "Андрей", "Андреевич", 50000, 4);
        employeemas[3] = employee4;

        Employee employee5 = new Employee("Сидоров ", "Андрей", "Анатольевичь", 130000, 5);
        employeemas[4] = employee5;
        System.out.println("Список сотрудников и их данные");
        employeeData(employeemas);
        System.out.println("Общая сумма затрат на зарплаты в месяц: " + totalSalaryForMonth(employeemas));

        int maxSum = maxSalaryEmployee(employeemas);
        int minSum = minSalaryEmployee(employeemas,maxSum);
        double averageSum =  averageSalaryEmployee(employeemas);
        System.out.println("Минимальная сумма зарплаты сотрудника составляет : " + minSum);
        System.out.println("Максимальная сумма зарплаты сотрудника составляет : " + maxSum);
        System.out.println("Среднее значение по зарплате сотавляет : " + averageSum);
        Fio(employeemas);
    }
    public static void employeeData(Employee employee[]) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i] );
            System.out.println(Employee.getId());
        }
    }

    public  static int totalSalaryForMonth(Employee[] sum) {
        int totalSum = 0;
        for (int i = 0; i < sum.length; i++) {
            totalSum += sum[i].getSalary();
        }
        return totalSum;
    }

    public static int minSalaryEmployee(Employee[] minSumEmployee,int minS) {
        int minSum = minS;
        for (int i = 0; i < minSumEmployee.length; i++) {
            if ( minSum > minSumEmployee[i].getSalary()) {
                minSum = minSumEmployee[i].getSalary();
            }
        }
        return minSum;
    }

    public static int maxSalaryEmployee(Employee[] maxSumEmployee) {
        int maxSum = 0;
        for (int i = 0; i < maxSumEmployee.length; i++) {
            if (maxSum < maxSumEmployee[i].getSalary()) {
                maxSum = maxSumEmployee[i].getSalary();
            }
        }
        return maxSum;
    }

    public static double averageSalaryEmployee(Employee[] average) {
         double averageSum = totalSalaryForMonth(average) / average.length;

        return averageSum;

    }

    public static void Fio(Employee [] fio) {
        for (int i = 0; i < fio.length; i++) {
            System.out.println("Ф.И.О. сотруника - " + fio[i].getSurName() +" "+fio[i].getName() + " "+ fio[i].getPatronymic());

        }

    }

}
