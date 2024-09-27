public class GoldDiscount : IDiscountStrategy
{
    public double CalculateDiscount(double amount)
    {
        return amount * 0.8; // 20% скидка
    }
}