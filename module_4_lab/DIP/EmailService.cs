public class EmailService : INotificationService
{
    public void SendNotification(string message)
    {
        Console.WriteLine($"Отправка Email: {message}");
    }
}