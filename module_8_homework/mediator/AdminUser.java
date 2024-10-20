public class AdminUser extends User {

    public AdminUser(IMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println("Admin " + this.name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message, User sender) {
        System.out.println("Admin " + this.name + " received a message from " + sender.getName() + ": " + message);
    }

    @Override
    public void receiveNotification(String notification) {
        System.out.println("Admin " + this.name + " received notification: " + notification);
    }

      
    public void kickUser(User user) {
        System.out.println("Admin " + this.name + " kicked out " + user.getName());
        mediator.removeUser(user);
    }
}
