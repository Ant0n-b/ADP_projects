class User extends Colleague {
    private String name;

    public User(IMediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    public void send(String message) {
        System.out.println(name + " отправляет сообщение: " + message);
        mediator.sendMessage(message, this);
    }

    public void sendPrivate(String message, Colleague recipient) {
        System.out.println(name + " отправляет приватное сообщение: " + message);
        mediator.sendPrivateMessage(message, this, recipient);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " получил сообщение: " + message);
    }

    public String getName() {
        return name;
    }
}
