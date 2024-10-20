public class ChatUser extends User {

    public ChatUser(IMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message, User sender) {
        System.out.println(this.name + " received message from " + sender.getName() + ": " + message);
    }

    @Override
    public void receiveNotification(String notification) {
        System.out.println(this.name + " received notification: " + notification);
    }
}