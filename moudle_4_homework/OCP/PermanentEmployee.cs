public class PermanentEmployee : Employee
{
    public override double CalculateSalary()
    {
        return BaseSalary * 1.2; // 20% бонус для постоянного сотрудника
    }
}