import java.util.HashMap;
import java.util.Map;

public class ChannelMediator {
    private Map<String, IMediator> channels;

    public ChannelMediator() {
        channels = new HashMap<>();
    }

    public void createChannel(String channelName) {
        channels.put(channelName, new ChatMediator());
    }

    public void sendMessage(String channelName, String message, User user) {
        IMediator channel = channels.get(channelName);
        if (channel != null) {
            if (channel.containsUser(user)) {
                channel.sendMessage(message, user);
            } else {
                System.out.println(user.getName() + " is not in the channel. Adding to channel: " + channelName);
                channel.addUser(user);
                channel.sendMessage(message, user);
            }
        } else {
            System.out.println("Channel does not exist. Creating a new channel: " + channelName);
            createChannel(channelName);
            channels.get(channelName).addUser(user);
            channels.get(channelName).sendMessage(message, user);
        }
    }

    public void addUserToChannel(String channelName, User user) {
        IMediator channel = channels.get(channelName);
        if (channel != null) {
            channel.addUser(user);
        } else {
            System.out.println("Channel does not exist. Creating a new channel: " + channelName);
            createChannel(channelName);
            channels.get(channelName).addUser(user);
        }
    }

    public void removeUserFromChannel(String channelName, User user) {
        IMediator channel = channels.get(channelName);
        if (channel != null) {
            channel.removeUser(user);
        }
    }

    public void banUser(User user) {
        for (IMediator channel : channels.values()) {
            channel.removeUser(user);
        }
        System.out.println(user.getName() + " has been banned from all channels.");
    }
}
