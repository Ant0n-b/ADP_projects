abstract class Employee {
    private String name;
    private int employeeId;
    private String position;

    public Employee(String name, int employeeId, String position) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getPosition() {
        return position;
    }

    // Абстрактный метод для расчета зарплаты
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name + ", Position: " + position;
    }
}