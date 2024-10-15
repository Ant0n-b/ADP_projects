class Manager extends Employee {
    private double fixedSalary;
    private double bonus;

    public Manager(String name, int employeeId, double fixedSalary, double bonus) {
        super(name, employeeId, "Manager");
        this.fixedSalary = fixedSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary + bonus;
    }
}