public interface IMediator {
void sendMessage(String message, User sender);
    void sendPrivateMessage(String message, User sender, User receiver);
    void sendGroupMessage(String message, User sender, List<User> group);
    void addUser(User user);
    void removeUser(User user);
}