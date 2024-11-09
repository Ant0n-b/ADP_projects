public class Main {
    public static void main(String[] args) {
        Department root = new Department("Head Office");
        Employee emp1 = new Employee("Alice", "Manager", 5000);
        Employee emp2 = new Employee("Bob", "Developer", 4000);

        Department subDept = new Department("IT Department");
        Employee emp3 = new Employee("Charlie", "Tester", 3500);
        subDept.add(emp3);

        root.add(emp1);
        root.add(emp2);
        root.add(subDept);

        root.display(0);

        System.out.println("Total Budget: " + root.calculateBudget());
        System.out.println("Total Employees: " + root.countEmployees());
    }
}
