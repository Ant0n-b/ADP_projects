public class SmsService : INotificationService
{
    public void SendNotification(string message)
    {
        Console.WriteLine($"Отправка SMS: {message}");
    }
}