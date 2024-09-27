public class ContractEmployee : Employee
{
    public override double CalculateSalary()
    {
        return BaseSalary * 1.1; // 10% бонус для контрактного сотрудника
    }
}