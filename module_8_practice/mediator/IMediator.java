import java.util.List;

public interface IMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
    void removeUser(User user);
    void notifyUsers(String message, User user);
}
