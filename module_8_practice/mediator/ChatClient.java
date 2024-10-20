public class ChatClient {
    public static void main(String[] args) {
        ChannelMediator channelMediator = new ChannelMediator();

        User alice = new User("Alice", new ChatMediator());
        User bob = new User("Bob", new ChatMediator());
        User charlie = new User("Charlie", new ChatMediator());

        channelMediator.createChannel("General");
        channelMediator.addUserToChannel("General", alice);
        channelMediator.addUserToChannel("General", bob);

        alice.sendMessage("Hello everyone!");
        bob.sendMessage("Hi Alice!");

        channelMediator.addUserToChannel("General", charlie);
        channelMediator.sendMessage("General", "Charlie has joined!", charlie);

        channelMediator.removeUserFromChannel("General", bob);
        bob.disconnect();
        
        channelMediator.banUser(charlie);
        channelMediator.sendMessage("General", "This is a message from Alice", alice);
    }
}
