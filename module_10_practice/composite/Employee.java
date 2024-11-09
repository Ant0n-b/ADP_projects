public class Employee extends OrgComponent {
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        super(name);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void display(int depth) {
        System.out.println(" ".repeat(depth) + "- " + name + " (" + position + ")");
    }

    @Override
    public double calculateBudget() {
        return salary;
    }

    @Override
    public int countEmployees() {
        return 1;
    }
}
