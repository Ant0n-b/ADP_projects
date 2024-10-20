public class ExtendedChannelMediator extends ChannelMediator {
    public void sendPrivateMessage(String message, User sender, User recipient) {
        recipient.receiveMessage(sender.getName() + " (private): " + message);
    }
}
