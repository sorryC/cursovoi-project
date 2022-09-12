public class Employee {

    private int id;
    private String Name;
    private double salary;
    private int department;
    private static int counter;

    public Employee(String name, double salary, int department) throws IllegalAccessException {
        if (department < 0 || department > 5) throw new IllegalAccessException("Введено неверное значение");
        id = counter++;
        this.Name = name;
        this.salary = salary;
        this.department = department;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) throws IllegalAccessException {
        if (department < 0 || department > 5) throw new IllegalAccessException("Введено неверное значение");
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Работник: " +
                " id номер: " + id +
                ". Имя сотрудника " + Name +
                ", заработная плата = " + salary + " рублей," +
                " отдел номер: " + department +
                '.';
    }
}
