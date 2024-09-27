public class OrderService
{
    public void CreateOrder(string productName, int quantity, double price)
    {
        ProcessOrder(productName, quantity, price, "created");
    }

    public void UpdateOrder(string productName, int quantity, double price)
    {
        ProcessOrder(productName, quantity, price, "updated");
    }

    private void ProcessOrder(string productName, int quantity, double price, string action)
    {
        double totalPrice = quantity * price;
        Console.WriteLine($"Order for {productName} {action}. Total: {totalPrice}");
    }
}