public class OrderCalculator
{
    public double CalculateTotalPrice(Order order)
    {
        return order.Quantity * order.Price * 0.9; // Расчет стоимости с учетом скидки
    }
}