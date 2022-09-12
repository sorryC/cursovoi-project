public class Main {


    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) throws IllegalAccessException {
        employees[0] = new Employee("Алексей Петров", 10_000, 1);
        employees[1] = new Employee("Александр Васин", 95_000, 2);
        employees[2] = new Employee("Василий Великий", 18_000, 3);
        employees[3] = new Employee("Frodo Begins", 27_000, 4);
        employees[4] = new Employee("Mishel Bober", 47_000, 4);
        employees[5] = new Employee("Миша Бобров", 26_000, 4);
        employees[6] = new Employee("Катерина Рериткова", 80_000, 4);
        employees[7] = new Employee("Александра Афонина", 22_000, 4);
        employees[8] = new Employee("Евгений Бодров", 20_000, 4);
        employees[9] = new Employee("Вячеслав Бородачев", 90_000, 4);

        printAllEmployee();
        System.out.println("Сумма затрат на зарплаты в месяц: " +sumSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " +lowEmploeeSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " +maxEmploeeSalary());
        System.out.println("Среднее значение зарплат: " + findTheAverageSalary() + " рублей");
        printAllName();
    }

    public static void printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }

    public static double sumSalary() {   //Сумма на все затраты!!!
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) continue;
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee lowEmploeeSalary() {
        Employee result = employees[0];
        int min = (int) employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < min) {
                min = (int) employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee maxEmploeeSalary() {
        Employee result = employees[0];
        int min = (int) employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > min) {
                min = (int) employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static double findTheAverageSalary() {
        return sumSalary() / (double) employees.length;
    }
    private static void printAllName() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}




