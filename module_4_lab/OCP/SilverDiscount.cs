public class SilverDiscount : IDiscountStrategy
{
    public double CalculateDiscount(double amount)
    {
        return amount * 0.9; // 10% скидка
    }
}