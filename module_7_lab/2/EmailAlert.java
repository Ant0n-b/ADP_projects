public class EmailAlert implements IObserver {
    private String emailAddress;

    public EmailAlert(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void update(float temperature) {
        System.out.println("Отправка email на " + emailAddress + ": Температура изменилась на " + temperature + "°C");
    }
}
