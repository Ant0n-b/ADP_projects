public class DiscountCalculator
{
    private readonly IDiscountStrategy _discountStrategy;

    public DiscountCalculator(IDiscountStrategy discountStrategy)
    {
        _discountStrategy = discountStrategy;
    }

    public double Calculate(double amount)
    {
        return _discountStrategy.CalculateDiscount(amount);
    }
}