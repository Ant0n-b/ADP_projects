public class RegularDiscount : IDiscountStrategy
{
    public double CalculateDiscount(double amount)
    {
        return amount;
    }
}