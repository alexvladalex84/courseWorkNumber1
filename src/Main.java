import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        EmployeeBook worker = new EmployeeBook();
        worker.addWorkers("Александров ", "Александр ", "Владимирович ", 300000, 1);
        worker.addWorkers("Мир ", "Ан ", "Анат ", 110005, 3);
        worker.addWorkers("Андреев ", "Андрей ", "Андреевич ", 50046, 1);
        worker.addWorkers("Рид ", "Vbн ", "Анат ", 120001, 5);
        worker.addWorkers("Пупко ", "Oн ", "Анат ", 120040, 2);
        worker.addWorkers("Попов ", "Евгений ", "Сергеевич ", 140000, 2);
        worker.addWorkers("Смиргов ", "Андрей ", "Анатольевичь ", 130055, 4);
        worker.addWorkers("Сид ", "Ан ", "Анат ", 20000, 3);
        worker.addWorkers("Мил ", "Анh ", "Анат ", 120028, 1);
        worker.addWorkers("Миk ", "Анf ", "Анат ", 109000, 5);
        worker.getCurrentSizeOfBook();
        separator();
        System.out.println("Удалить сотрудника ");
        worker.removeTheWorker(7);
        separator();
        System.out.println("Изменить зарплату и отдел сотрудника ");

        worker.changeWorkerSalary("Мир ", "Ан ", "Анат ", 150000);
        worker.changeWorkerDepartment("Александров ", "Александр ", "Владимирович ", 2);
        separator();
        System.out.println(" Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников)");
        worker.printListOfWorkersAndDepartments();
        separator();
        System.out.println("Список всех сотрудников : ");
        System.out.println("Занятое место в книге : " + worker.getCurrentSizeOfBook());
        separator();
        worker.printAllWorks();
        separator();
        System.out.println("Общая зарплата всех сотрудников за 1 месяц : " + worker.countTotalSalaryForMonth());
        separator();
        System.out.println("Минимальная зарплата всех сотрудников за 1 месяц : " + worker.countMinSalaryWorkers());
        separator();
        System.out.println("Максимальная зарплата всех сотрудников за 1 месяц : " + worker.contMaxSalaryWorkers());
        separator();
        System.out.println("Среднее значение по зарплате за месяц : " + worker.countAverageSalaryWorkers());
        separator();
        System.out.println("Ф.И.О всех сотрудников : ");
        worker.printfio();
        separator();
        System.out.println("Повысить зарплату в % : ");
        double precent = worker.countPercentSalary(worker.countTotalSalaryForMonth(), 10);
        System.out.println(precent);
        separator();
        System.out.println("Найти сотрудника по ID : ");
        worker.findById(0);
        separator();
        System.out.println("Список работников без номера отдела : ");
        worker.printWorksNoDepartament();
        System.out.println("Зарплата больше или меньше от определенного числа");
        worker.countNumberMoreOrUnder(200000);
        separator();
        System.out.println("Данные сотрудников отдела : ");
        worker.departmentNumber(1);
        separator();
        System.out.println("Повысить зарплату в % по отделам ");
        worker.countPercentInDepartment(2, 10);
    }

    public static void separator () {
        System.out.println("============================");
    }
    }


















