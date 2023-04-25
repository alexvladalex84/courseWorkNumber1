public class EmployeeBook {

    private final Employee workers[];
     private int size;

    public EmployeeBook() {
        this.workers = new Employee[10];
    }

    public void addWorkers(String surName, String name, String patronymic, int salary, int department) {
        if (size >= workers.length) {
            System.out.println("Нельзя добавить работника, закончилось место");
        }
            Employee newEmployee = new Employee(surName, name, patronymic, salary, department);
            workers[size++] = newEmployee;
            }
      public void removeTheWorker(int ID) {
          for (int i = 0; i < workers.length; i++) {
              if (ID == workers[i].getId()) {
                  System.out.println(workers[i] + " удален из списка ");
                  workers[i] = null;
              }
          }

      }

    public int getCurrentSizeOfBook() {
        return size;
    }
    public void changeWorkerSalary(String surName, String name, String patronymic,int changeSalary) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null) {
                if (workers[i].getSurName().equals(surName) && workers[i].getName().equals(name) && workers[i].getPatronymic().equals(patronymic)) {
                    workers[i].setSalary(changeSalary);
                    System.out.println("Вы изменили зарплату сотруднику  " + workers[i].getSurName() + " ,теперь его зарплата сотавляет : " + workers[i].getSalary() + " рублей");
                }
            }
        }
    }
    public void changeWorkerDepartment(String surName, String name, String patronymic,int changeDepartment) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null) {
                if (workers[i].getSurName().equals(surName) && workers[i].getName().equals(name) && workers[i].getPatronymic().equals(patronymic)) {
                    workers[i].setDepartment(changeDepartment);
                    System.out.println("сотрудник " + workers[i].getSurName() + " переведен в отдел № : " + workers[i].getDepartment());
                }
            }
        }
    }
   public void printListOfWorkersAndDepartments() {
       for (int i = 0; i < workers.length; i++) {
           if (workers[i] != null) {
               System.out.println(workers[i].getSurName() + workers[i].getName() + workers[i].getPatronymic() + " отдел : " + workers[i].getDepartment());
           }
       }

   }


    public void printAllWorks() {                // Вся информация о сотрудниках

        for (int i = 0; i < size; i++) {
            if (workers[i] != null) {
                System.out.println(workers[i]);

            }
        }
    }


    public int countTotalSalaryForMonth() {               //общая сумма зарплат за месяц
        int totalSum = 0;
        for (int i = 0; i < workers.length; i++) {
            if(workers[i] != null){
            totalSum += workers[i].getSalary();
        }}
        return totalSum;
    }

    public  int countMinSalaryWorkers() {    //минимальная зарплата из всех
        int minSum = 1000000;
        for (int i = 0; i < workers.length; i++) {
            if(workers[i] != null){
            if ( minSum > workers[i].getSalary()) {
                minSum = workers[i].getSalary();
            }}
        }
        return minSum;
    }

    public  int contMaxSalaryWorkers() {      //максимальная зарплата из всех
        int maxSum = 0;
        for (int i = 0; i < workers.length; i++) {
            if(workers[i] != null){
            if (maxSum < workers[i].getSalary()) {
                maxSum = workers[i].getSalary();
            }}
        }
        return maxSum;
    }

    public  double countAverageSalaryWorkers() {        //среднее значенеие суммы зарплат
        double averageSum = countTotalSalaryForMonth() / workers.length;

        return averageSum;
    }

    public  void printfio() {                    // печать ФИО
        for (int i = 0; i < workers.length; i++) {
            if(workers[i] != null){
            System.out.println("Ф.И.О. сотруника - " + workers[i].getSurName() + " " + workers[i].getName() + " " + workers[i].getPatronymic());
        }}
    }

    public  double countPercentSalary(int salary,int percent) {   //подсчет в процентах
        double sum = ((double) salary * percent / 100);
        return sum;
    }

    public  void findById(int numID ) {                             //найти по ID

        for (int i = 0; i < workers.length; i++) {
            if(workers[i] != null){
            if (numID == workers[i].getId()) {
                System.out.println("Есть такой ID : " + workers[i]);
            }}
        }
    }

    public  void printWorksNoDepartament() {           //Вывод данных без номера отдела
        for (int i = 0; i < workers.length; i++) {
            if(workers[i] != null){
            System.out.println(workers[i].getSurName() + workers[i].getName() + workers[i].getPatronymic() + workers[i].getSalary());
        }}
    }

    public  void countNumberMoreOrUnder(int number) {   // 3. Получить в качестве параметра число и найти:
        int sum = number;                                                   //   1. Всех сотрудников с зарплатой меньше
        for (int i = 0; i < workers.length; i++) {
            if(workers[i] != null){                                    //  числа (вывести id, Ф. И. О. и зарплатой в консоль).
            if (sum >= workers[i].getSalary()) {                   //   2. Всех сотрудников с зарплатой больше (или равно)
                System.out.println("Зарплата меньше числа " + number);   //   числа (вывести id, Ф. И. О. и зарплатой в консоль).

                System.out.println("ID : " + workers[i].getId() + " " + workers[i].getSurName() + workers[i].getName() + workers[i].getPatronymic() + workers[i].getSalary());
            } else {
                System.out.println("Зарплата больше числа " + number);
                System.out.println("ID : " + workers[i].getId() + " " + workers[i].getSurName() + workers[i].getName() + workers[i].getPatronymic() + workers[i].getSalary());
            }}
        }  }




    public void countPercentInDepartment(int department, int percent) {
        if (department <= 0 || department > 5) {
            System.out.println("Отдела % : " + department + " не существует ");
        }                                                                   //подсчет в процетах по отделам
        if (department == 1) {
            int count = 0;
            for (int i = 0; i < workers.length; i++) {
                if (workers[i].getDepartment() == 1) {
                    count++;
                }
            }
            Employee[] department1 = new Employee[count];
            int index = 0;
            for (int i = 0; i < workers.length; i++) {
                if (workers[i].getDepartment() == 1) {
                    department1[index] = workers[i];
                    index++;
                }
            }
            int totalSum = 0;
            for (int i = 0; i < department1.length; i++) {
                totalSum = totalSum + department1[i].getSalary();
            }
            double sumPercent = ((double) totalSum * percent / 100);
            System.out.println(" Поднять зарплату в отделе № 1  на " + percent + " %  : общая сумма в рублях = " + sumPercent);


        } else if (department == 2) {
            int count = 0;
            for (int i = 0; i < workers.length; i++) {
                if(workers[i] != null){
                if (workers[i].getDepartment() == 2) {
                    count++;
                }}
            }
            Employee[] department2 = new Employee[count];
            int index = 0;
            for (int i = 0; i < workers.length; i++) {
                if(workers[i] != null){
                if (workers[i].getDepartment() == 2) {
                    department2[index] = workers[i];
                    index++;
                }}
            }
            int totalSum = 0;
            for (int i = 0; i < department2.length; i++) {
                totalSum = totalSum + department2[i].getSalary();
            }
            double sumPercent = ((double) totalSum * percent / 100);
            System.out.println(" Поднять зарплату в отделе № 2  на " + percent + " %  : общая сумма в рублях = " + sumPercent);

        } else if (department == 3) {
            int count = 0;
            for (int i = 0; i < workers.length; i++) {
                if (workers[i].getDepartment() == 3) {
                    count++;
                }
            }
            Employee[] department3 = new Employee[count];
            int index = 0;
            for (int i = 0; i < workers.length; i++) {
                if (workers[i].getDepartment() == 3) {
                    department3[index] = workers[i];
                    index++;
                }
            }
            int totalSum = 0;
            for (int i = 0; i < department3.length; i++) {
                totalSum = totalSum + department3[i].getSalary();
            }
            double sumPercent = ((double) totalSum * percent / 100);
            System.out.println(" Поднять зарплату в отделе № 3  на " + percent + " %  : общая сумма в рублях = " + sumPercent);

        } else if (department == 4) {
            int count = 0;
            for (int i = 0; i < workers.length; i++) {
                if (workers[i].getDepartment() == 4) {
                    count++;
                }
            }
            Employee[] department4 = new Employee[count];
            int index = 0;
            for (int i = 0; i < workers.length; i++) {
                if (workers[i].getDepartment() == 4) {
                    department4[index] = workers[i];
                    index++;
                }
            }
            int totalSum = 0;
            for (int i = 0; i < department4.length; i++) {
                totalSum = totalSum + department4[i].getSalary();
            }
            double sumPercent = ((double) totalSum * percent / 100);

            System.out.println(" Поднять зарплату в отделе № 4  на " + percent + " %  : общая сумма в рублях = " + sumPercent);

        } else if (department == 5) {
            int count = 0;
            for (int i = 0; i < workers.length; i++) {
                if (workers[i].getDepartment() == 5) {
                    count++;
                }
            }
            Employee[] department5= new Employee[count];
            int index = 0;
            for (int i = 0; i < workers.length; i++) {
                if (workers[i].getDepartment() == 5) {
                    department5[index] = workers[i];
                    index++;
                }
            }
            int totalSum = 0;
            for (int i = 0; i < department5.length; i++) {
                totalSum = totalSum + department5[i].getSalary();
            }
            double sumPercent = ((double) totalSum * percent / 100);

            System.out.println(" Поднять зарплату в отделе № 5  на " + percent + " %  : общая сумма в рублях = " + sumPercent);
        }
    }


    public void departmentNumber(int department) {
        if (department <= 0 || department > 5) {
            System.out.println("Такого отдела не существует ");
        }//данные по департаментам
        if (department == 1) {
            System.out.println("Данные о сотрудниках отдела № 1: ");
            int count = 0;
            for (int i = 0; i < workers.length; i++) {
                if(workers[i] != null){
                if (workers[i].getDepartment() == 1) {
                    count++;
                }}
            }
            Employee[] department1 = new Employee[count];
            int index = 0;
            for (int i = 0; i < workers.length; i++) {
                if(workers[i] != null){
                if (workers[i].getDepartment() == 1) {
                    department1[index] = workers[i];
                    System.out.println(department1[index]);
                    index++;
                }}
            }
            seporator();
            int minSum = 1000000;
            for (int i = 0; i < department1.length; i++) {
                if (minSum > department1[i].getSalary()) {
                    minSum = department1[i].getSalary();
                }
            }
            System.out.println("Минимальная сумма зарплат в отделе № 1 : " + minSum);
            seporator();
            int maxSum = 0;
            for (int i = 0; i < department1.length; i++) {
                if (maxSum < department1[i].getSalary()) {
                    maxSum = department1[i].getSalary();
                }
            }
            System.out.println("Минимальная сумма зарплат в отделе № 1 : " + maxSum);
            seporator();

            int totalSum = 0;
            for (int i = 0; i < department1.length; i++) {
                totalSum = totalSum + department1[i].getSalary();
            }
            System.out.println("Общая сумма зарплат за месяц в отделе № 1 : " + totalSum);
            seporator();
            double averageSum = totalSum / department1.length;
            System.out.println("Средняя зарплата по отделу № 1 : " + averageSum);
            seporator();
            System.out.println("Список сотрудников отдела № 1 :");
            for (int i = 0; i < department1.length; i++) {
                System.out.println(department1[i].getSurName() + department1[i].getName() + department1[i].getPatronymic() + department1[i].getSalary());
            }
            seporator();


        } else if (department == 2) {
            System.out.println("Данные о сотрудниках отдела № 2: ");
            int count = 0;
            for (int i = 0; i < workers.length; i++) {
                if (workers[i].getDepartment() == 2) {
                    count++;
                }
            }
            Employee[] department2 = new Employee[count];
            int index = 0;
            for (int i = 0; i < workers.length; i++) {
                if (workers[i].getDepartment() == 2) {
                    department2[index] = workers[i];
                    System.out.println(department2[index]);
                    index++;
                }
            }
            seporator();
            int minSum = 1000000;
            for (int i = 0; i < department2.length; i++) {
                if (minSum > department2[i].getSalary()) {
                    minSum = department2[i].getSalary();
                }
            }
            System.out.println("Минимальная сумма зарплат в отделе № 2 : " + minSum);
            seporator();
            int maxSum = 0;
            for (int i = 0; i < department2.length; i++) {
                if (maxSum < department2[i].getSalary()) {
                    maxSum = department2[i].getSalary();
                }
            }
            System.out.println("Минимальная сумма зарплат в отделе № 2 : " + maxSum);
            seporator();

            int totalSum = 0;
            for (int i = 0; i < department2.length; i++) {
                totalSum = totalSum + department2[i].getSalary();
            }
            System.out.println("Общая сумма зарплат за месяц в отделе № 2 : " + totalSum);
            seporator();
            double averageSum = totalSum / department2.length;
            System.out.println("Средняя зарплата по отделу № 2 : " + averageSum);
            seporator();
            System.out.println("Список сотрудников отдела № 2 :");
            for (int i = 0; i < department2.length; i++) {
                System.out.println(department2[i].getSurName() + department2[i].getName() + department2[i].getPatronymic() + department2[i].getSalary());
            }
            seporator();

        } else if (department == 3) {
            System.out.println("Данные о сотрудниках отдела № 3: ");
            int count = 0;
            for (int i = 0; i < workers.length; i++) {
                if (workers[i].getDepartment() == 3) {
                    count++;
                }
            }
            Employee[] department3 = new Employee[count];
            int index = 0;
            for (int i = 0; i < workers.length; i++) {
                if (workers[i].getDepartment() == 3) {
                    department3[index] = workers[i];
                    System.out.println(department3[index]);
                    index++;
                }
            }
            seporator();
            int minSum = 1000000;
            for (int i = 0; i < department3.length; i++) {
                if (minSum > department3[i].getSalary()) {
                    minSum = department3[i].getSalary();
                }
            }
            System.out.println("Минимальная сумма зарплат в отделе № 3 : " + minSum);
            seporator();
            int maxSum = 0;
            for (int i = 0; i < department3.length; i++) {
                if (maxSum < department3[i].getSalary()) {
                    maxSum = department3[i].getSalary();
                }
            }
            System.out.println("Минимальная сумма зарплат в отделе № 3 : " + maxSum);
            seporator();

            int totalSum = 0;
            for (int i = 0; i < department3.length; i++) {
                totalSum = totalSum + department3[i].getSalary();
            }
            System.out.println("Общая сумма зарплат за месяц в отделе № 3 : " + totalSum);
            seporator();
            double averageSum = totalSum / department3.length;
            System.out.println("Средняя зарплата по отделу № 3 : " + averageSum);
            seporator();
            System.out.println("Список сотрудников отдела № 3 :");
            for (int i = 0; i < department3.length; i++) {
                System.out.println(department3[i].getSurName() + department3[i].getName() + department3[i].getPatronymic() + department3[i].getSalary());
            }
            seporator();
        } else if (department == 4) {
            System.out.println("Данные о сотрудниках отдела № 4: ");
            int count = 0;
            for (int i = 0; i < workers.length; i++) {
                if (workers[i].getDepartment() == 4) {
                    count++;
                }
            }
            Employee[] department4 = new Employee[count];
            int index = 0;
            for (int i = 0; i < workers.length; i++) {
                if (workers[i].getDepartment() == 4) {
                    department4[index] = workers[i];
                    System.out.println(department4[index]);
                    index++;
                }
            }
            seporator();
            int minSum = 1000000;
            for (int i = 0; i < department4.length; i++) {
                if (minSum > department4[i].getSalary()) {
                    minSum = department4[i].getSalary();
                }
            }
            System.out.println("Минимальная сумма зарплат в отделе № 4 : " + minSum);
            seporator();
            int maxSum = 0;
            for (int i = 0; i < department4.length; i++) {
                if (maxSum < department4[i].getSalary()) {
                    maxSum = department4[i].getSalary();
                }
            }
            System.out.println("Минимальная сумма зарплат в отделе № 4 : " + maxSum);
            seporator();

            int totalSum = 0;
            for (int i = 0; i < department4.length; i++) {
                totalSum = totalSum + department4[i].getSalary();
            }
            System.out.println("Общая сумма зарплат за месяц в отделе № 4 : " + totalSum);
            seporator();
            double averageSum = totalSum / department4.length;
            System.out.println("Средняя зарплата по отделу № 4 : " + averageSum);
            seporator();
            System.out.println("Список сотрудников отдела № 4 :");
            for (int i = 0; i < department4.length; i++) {
                System.out.println(department4[i].getSurName() + department4[i].getName() + department4[i].getPatronymic() + department4[i].getSalary());
            }

        } else if (department == 5) {
            System.out.println("Данные о сотрудниках отдела № 5: ");
            int count = 0;
            for (int i = 0; i < workers.length; i++) {
                if (workers[i].getDepartment() == 5) {
                    count++;
                }
            }
            Employee[] department2 = new Employee[count];
            int index = 0;
            for (int i = 0; i < workers.length; i++) {
                if (workers[i].getDepartment() == 5) {
                    department2[index] = workers[i];
                    System.out.println(department2[index]);
                    index++;
                }
            }
            seporator();
            int minSum = 1000000;
            for (int i = 0; i < department2.length; i++) {
                if (minSum > department2[i].getSalary()) {
                    minSum = department2[i].getSalary();
                }
            }
            System.out.println("Минимальная сумма зарплат в отделе № 5 : " + minSum);
            seporator();
            int maxSum = 0;
            for (int i = 0; i < department2.length; i++) {
                if (maxSum < department2[i].getSalary()) {
                    maxSum = department2[i].getSalary();
                }
            }
            System.out.println("Минимальная сумма зарплат в отделе № 5 : " + maxSum);
            seporator();

            int totalSum = 0;
            for (int i = 0; i < department2.length; i++) {
                totalSum = totalSum + department2[i].getSalary();
            }
            System.out.println("Общая сумма зарплат за месяц в отделе № 5 : " + totalSum);
            seporator();
            double averageSum = totalSum / department2.length;
            System.out.println("Средняя зарплата по отделу № 5 : " + averageSum);
            seporator();
            System.out.println("Список сотрудников отдела № 5 :");
            for (int i = 0; i < department2.length; i++) {
                System.out.println(department2[i].getSurName() + department2[i].getName() + department2[i].getPatronymic() + department2[i].getSalary());
            }
        }
    }
    //    public  void departamentNumber(int namberDepartament ) {  //сотрудники по отделам
//        if (namberDepartament <= 0 || namberDepartament > 5) {
//            System.out.println("Такого отдела нет");
//
//        } else if (namberDepartament == 1) {
//            System.out.println("ОТДЕЛ № 1");
//            int count = 0;                           //с данного массива переместили нужные данные в другой массив
//            for (int i = 0; i < workers.length; i++) { //
//                if (workers[i].getDepartment() == 1) { //
//                    count++;                        // мы узнали количество элементов которое будет в новом массиве
//                }
//            }
//
//            Employee[] departament1 = new Employee[count];     // в массиве в который перенесли данные,теперь два элемента
//            int index = 0;                             //
//            for (int i = 0; i < workers.length; i++) {
//                if (workers[i].getDepartment() == 1) {   //по условиям задачи
//                    departament1[index] = workers[i];            // теперь данные записались в другой массив
//                    index++;
//
//                }
//            }
//
//            printAllWorks();
//            System.out.println("++++++++++");
//            System.out.println("Минимальная зарплата в отделе 1 : " + EmployeeBook.minSalaryEmployee(departament1));
//            System.out.println("Максимальная зарплата в отделе 1 : " + EmployeeBook.maxSalaryEmployee(departament1));
//            int totalSalaryDrp1 = EmployeeBook.totalSalaryForMonth(departament1);
//            System.out.println("Общая сумма затрат на зарплату по отделу 1 : " + totalSalaryDrp1);
//            System.out.println("Средняя сумма зарплат по отделу 1 : " + EmployeeBook.averageSalaryEmployee(departament1));
//            System.out.println("Индексация в % всех сотрудников отдела 1 : ");
//            System.out.println(EmployeeBook.salaryPercent(totalSalaryDrp1, 1));
//            System.out.println("++++++++++");
//            System.out.println("Список сотрудников отдела 1 (без номера отдела) : ");
//
//            EmployeeBook.fioOfDepartament(departament1);
//            System.out.println("++++++++++");
//            System.out.println("Зарплата меньше числа : ");
//            EmployeeBook.numberMoreOrUnder(140000, departament1);
//            System.out.println("++++++++++");
//
//        }
//        } else if (namberDepartament == 2) {
//            System.out.println("ОТДЕЛ № 2");
//            int count = 0;                             //с данного массива переместили нужные данные в другой массив
//            for (int i = 0; i < workers.length; i++) {   //
//                if (workers[i].getDepartment() == 2) {   //
//                    count++;                           // мы узнали количество элементов которое будет в новом массиве
//                }
//
//            }
//
//            Employee[] departament2 = new Employee[count];     // в массиве в который перенесли данные,теперь два элемента
//            int index = 0;                             //
//            for (int i = 0; i < workers.length; i++) {
//                if (workers[i].getDepartment() == 2) {   //по условиям задачи
//                    departament2[index] = workers[i];            // теперь данные записались в другой массив
//                    index++;
//                }
//            }
//            EmployeeBook.employeeData(departament2);
//            System.out.println("++++++++++");
//            System.out.println("Минимальная зарплата в отделе 2 : " + EmployeeBook.minSalaryEmployee(departament2));
//            System.out.println("Максимальная зарплата в отделе 2 : " + EmployeeBook.maxSalaryEmployee(departament2));
//            int totalSalaryDrp1 = EmployeeBook.totalSalaryForMonth(departament2);
//            System.out.println("Общая сумма затрат на зарплату по отделу 2 : " + totalSalaryDrp1);
//            System.out.println("Средняя сумма зарплат по отделу 2 : " + EmployeeBook.averageSalaryEmployee(departament2));
//            System.out.println("Индексация в % всех сотрудников отдела 2 : ");
//            System.out.println(EmployeeBook.salaryPercent(totalSalaryDrp1, 2));
//            System.out.println("++++++++++");
//            System.out.println("Список сотрудников отдела 2 (без номера отдела) : ");
//
//            EmployeeBook.fioOfDepartament(departament2);
//            System.out.println("++++++++++");
//            System.out.println("Зарплата меньше числа : ");
//            EmployeeBook.numberMoreOrUnder(140000, departament2);
//            System.out.println("++++++++++");
//
//
//        } else if (namberDepartament == 3) {
//            System.out.println("ОТДЕЛ № 3");
//            int count = 0;                             //с данного массива переместили нужные данные в другой массив
//            for (int i = 0; i < workers.length; i++) {   //
//                if (workers[i].getDepartment() == 3) {   //
//                    count++;                           // мы узнали количество элементов которое будет в новом массиве
//                }
//
//            }
//
//            Employee[] departament3 = new Employee[count];     // в массиве в который перенесли данные,теперь два элемента
//            int index = 0;                             //
//            for (int i = 0; i < workers.length; i++) {
//                if (workers[i].getDepartment() == 3) {   //по условиям задачи
//                    departament3[index] = workers[i];            // теперь данные записались в другой массив
//                    index++;
//                }
//            }
//            EmployeeBook.employeeData(departament3);
//            System.out.println("++++++++++");
//            System.out.println("Минимальная зарплата в отделе 3 : " + EmployeeBook.minSalaryEmployee(departament3));
//            System.out.println("Максимальная зарплата в отделе 3 : " + EmployeeBook.maxSalaryEmployee(departament3));
//            int totalSalaryDrp1 = EmployeeBook.totalSalaryForMonth(departament3);
//            System.out.println("Общая сумма затрат на зарплату по отделу 3 : " + totalSalaryDrp1);
//            System.out.println("Средняя сумма зарплат по отделу 3 : " + EmployeeBook.averageSalaryEmployee(departament3));
//            System.out.println("Индексация в % всех сотрудников отдела 3 : ");
//            System.out.println(EmployeeBook.salaryPercent(totalSalaryDrp1, 3));
//            System.out.println("++++++++++");
//            System.out.println("Список сотрудников отдела 3 (без номера отдела) : ");
//
//            EmployeeBook.fioOfDepartament(departament3);
//            System.out.println("++++++++++");
//            System.out.println("Зарплата меньше числа : ");
//            EmployeeBook.numberMoreOrUnder(140000, departament3);
//            System.out.println("++++++++++");
//
//
//        }else if (namberDepartament == 4) {
//            System.out.println("ОТДЕЛ № 4 ");
//            int count = 0;                             //с данного массива переместили нужные данные в другой массив
//            for (int i = 0; i < workers.length; i++) {   //
//                if (workers[i].getDepartment() == 4) {   //
//                    count++;                           // мы узнали количество элементов которое будет в новом массиве
//                }
//
//            }
//
//            Employee[] departament4 = new Employee[count];     // в массиве в который перенесли данные,теперь два элемента
//            int index = 0;                             //
//            for (int i = 0; i < workers.length; i++) {
//                if (workers[i].getDepartment() == 4) {   //по условиям задачи
//                    departament4[index] = workers[i];            // теперь данные записались в другой массив
//                    index++;
//                }
//            }
//            EmployeeBook.employeeData(departament4);
//            System.out.println("++++++++++");
//            System.out.println("Минимальная зарплата в отделе 4 : " + EmployeeBook.minSalaryEmployee(departament4));
//            System.out.println("Максимальная зарплата в отделе 4 : " + EmployeeBook.maxSalaryEmployee(departament4));
//            int totalSalaryDrp1 = EmployeeBook.totalSalaryForMonth(departament4);
//            System.out.println("Общая сумма затрат на зарплату по отделу 4 : " + totalSalaryDrp1);
//            System.out.println("Средняя сумма зарплат по отделу 4 : " + EmployeeBook.averageSalaryEmployee(departament4));
//            System.out.println("Индексация в % всех сотрудников отдела 4 : ");
//            System.out.println(EmployeeBook.salaryPercent(totalSalaryDrp1, 4));
//            System.out.println("++++++++++");
//            System.out.println("Список сотрудников отдела 3 (без номера отдела) : ");
//
//            EmployeeBook.fioOfDepartament(departament4);
//            System.out.println("++++++++++");
//            System.out.println("Зарплата меньше числа : ");
//            EmployeeBook.numberMoreOrUnder(140000, departament4);
//            System.out.println("++++++++++");
//
//
//        }else if (namberDepartament == 5) {
//            System.out.println("ОТДЕЛ № 5");
//            int count = 0;                             //с данного массива переместили нужные данные в другой массив
//            for (int i = 0; i < workers.length; i++) {   //
//                if (workers[i].getDepartment() == 5) {   //
//                    count++;                           // мы узнали количество элементов которое будет в новом массиве
//                }
//
//            }
//
//            Employee[] departament5 = new Employee[count];     // в массиве в который перенесли данные,теперь два элемента
//            int index = 0;                             //
//            for (int i = 0; i < workers.length; i++) {
//                if (workers[i].getDepartment() == 5) {   //по условиям задачи
//                    departament5[index] = workers[i];            // теперь данные записались в другой массив
//                    index++;
//                }
//            }
//            EmployeeBook.employeeData(departament5);
//            System.out.println("++++++++++");
//            System.out.println("Минимальная зарплата в отделе 5 : " + EmployeeBook.minSalaryEmployee(departament5));
//            System.out.println("Максимальная зарплата в отделе 5 : " + EmployeeBook.maxSalaryEmployee(departament5));
//            int totalSalaryDrp1 = EmployeeBook.totalSalaryForMonth(departament5);
//            System.out.println("Общая сумма затрат на зарплату по отделу 5 : " + totalSalaryDrp1);
//            System.out.println("Средняя сумма зарплат по отделу 5 : " + EmployeeBook.averageSalaryEmployee(departament5));
//            System.out.println("Индексация в % всех сотрудников отдела 5 : ");
//            System.out.println(EmployeeBook.salaryPercent(totalSalaryDrp1, 5));
//            System.out.println("++++++++++");
//            System.out.println("Список сотрудников отдела 3 (без номера отдела) : ");
//
//            EmployeeBook.fioOfDepartament(departament5);
//            System.out.println("++++++++++");
//            System.out.println("Зарплата меньше числа : ");
//            EmployeeBook.numberMoreOrUnder(140000, departament5);
//            System.out.println("++++++++++");
//
//
//        }
//
//
//
//
//
//
//
//}
    public void seporator() {
        System.out.println("+++++++++++++++");
    }
        }
//2. Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
//        1. Сотрудника с минимальной зарплатой.
//        2. Сотрудника с максимальной зарплатой.
//        3. Сумму затрат на зарплату по отделу.