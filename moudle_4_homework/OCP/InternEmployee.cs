public class InternEmployee : Employee
{
    public override double CalculateSalary()
    {
        return BaseSalary * 0.8; // 80% от базовой зарплаты для стажера
    }
}