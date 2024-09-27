public class Notification
{
    private readonly INotificationService _notificationService;

    public Notification(INotificationService notificationService)
    {
        _notificationService = notificationService;
    }

    public void Send(string message)
    {
        _notificationService.SendNotification(message);
    }
}