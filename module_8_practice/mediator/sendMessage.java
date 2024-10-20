public void sendMessage(String channelName, String message, User user) {
    IMediator channel = channels.get(channelName);
    if (channel != null) {
        if (channel.containsUser(user)) {
            channel.sendMessage(message, user);
        } else {
            System.out.println(user.getName() + " is not in the channel.");
        }
    } else {
        System.out.println("Channel does not exist. Creating a new channel: " + channelName);
        createChannel(channelName);
        channels.get(channelName).sendMessage(message, user);
    }
}
