public class EmployeeSystem {

    public static void main(String[] args) {
        // Создаем сотрудников различных типов
        Employee worker1 = new Worker("John Doe", 101, 20.5, 160); // Рабочий с почасовой ставкой и количеством часов
        Employee manager1 = new Manager("Alice Smith", 102, 3000, 500); // Менеджер с фиксированной зарплатой и премией

        // Добавляем сотрудников в систему (например, в массив)
        Employee[] employees = { worker1, manager1 };

        // Отображаем зарплаты сотрудников
        for (Employee employee : employees) {
            System.out.println(employee.toString());
            System.out.println("Salary: " + employee.calculateSalary());
            System.out.println("-------------------------");
        }
    }
}