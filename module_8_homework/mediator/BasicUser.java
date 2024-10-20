public class BasicUser extends User {

    public BasicUser(IMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message, User sender) {
        System.out.println(this.name + " received a message from " + sender.getName() + ": " + message);
    }
}
