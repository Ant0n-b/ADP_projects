public abstract class Employee
{
    public string Name { get; set; }
    public double BaseSalary { get; set; }
    public abstract double CalculateSalary();
}