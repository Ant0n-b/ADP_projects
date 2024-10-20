public abstract class User {
    protected IMediator mediator;
    protected String name;

    public User(IMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void send(String message);

    public abstract void receive(String message, User sender);

    public void sendPrivate(String message, User receiver) {
        System.out.println(this.name + " sends a private message to " + receiver.getName());
        mediator.sendPrivateMessage(message, this, receiver);
    }

    public void sendGroup(String message, List<User> group) {
        System.out.println(this.name + " sends a group message.");
        mediator.sendGroupMessage(message, this, group);
    }

    public void receiveNotification(String notification) {
        System.out.println(this.name + " received notification: " + notification);
    }
}
