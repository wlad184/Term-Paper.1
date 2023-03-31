public class Main {
    public static void main(String[] args) {
        Employee[] empl = new Employee[10];
        empl[0] = new Employee("Койнова Вера Анатольевна", 45000f, 4);
        empl[1] = new Employee("Сидоров Виктор Васильевич", 65000f, 3);
        empl[2] = new Employee("Коновалов Серьгей Витальевич", 35555f, 5);
        empl[3] = new Employee("Сидоров Антон Васильевич", 80000f, 2);
        empl[4] = new Employee("Фёдоров Семён Семёнович", 97500f, 1);
        empl[5] = new Employee("Иванов Игорь Артемьевич", 80700f, 2);
        empl[6] = new Employee("Романюк Роман Романович", 30000f, 5);
        empl[7] = new Employee("Фёдорова Светлана Александровна", 90500f, 1);
        empl[8] = new Employee("Абрамов Артём Валерьевич", 65000f, 3);
        empl[9] = new Employee("Колмогорова Вероника Игнатьевна", 48800f, 4);


        employeeData(empl);
        sumSalary(empl);
        minSalary(empl);
        maxSalary(empl);
        averageSalary(empl);
        employeeFullName(empl);
    }

    // Вывод данных всех сотрудников
    public static void employeeData(Employee data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println();
    }

    //расчет суммы зарплат всех сотрудников
    public static void sumSalary(Employee salary[]) {
        float s = 0;
        for (int i = 0; i < salary.length; i++) {
            s = s + salary[i].getSalary();
        }
        System.out.println("Сумма зарплат всех сотрудников = " + s);
        System.out.println();
    }

    //расчет минимальной зарплаты
    public static void minSalary(Employee salary[]) {
        int j = 0;
        float min = salary[0].getSalary();
        for (int i = 0; i < salary.length; i++) {
            if (salary[i].getSalary() < min) {
                min = salary[i].getSalary();
                j = i;
            }
        }
        System.out.println("Минимальная зарплата у сотрудника " + salary[j].getFullName() + " = " + min);
        System.out.println();
    }

    //расчет максимальной зарплаты
    public static void maxSalary(Employee salary[]) {
        int j = 0;
        float max = salary[0].getSalary();
        for (int i = 0; i < salary.length; i++) {
            if (salary[i].getSalary() > max) {
                max = salary[i].getSalary();
                j = i;
            }
        }
        System.out.println("Максимальная зарплата у сотрудника " + salary[j].getFullName() + " = " + max);
        System.out.println();
    }

    //расчет среднего значения зарплаты
    public static void averageSalary(Employee salary[]) {
        float s = 0;
        for (int i = 0; i < salary.length; i++) {
            s = s + salary[i].getSalary();
        }
        s = s / salary.length;
        System.out.println("Среднее значение зарплат всех сотрудников = " + s);
        System.out.println();
    }

    public static void employeeFullName(Employee fullName[]) {
        System.out.println("Список ФИО всех сотрудников: ");
        for (int i = 0; i < fullName.length; i++) {
            System.out.println(fullName[i].getFullName());
        }
        System.out.println();

    }


}