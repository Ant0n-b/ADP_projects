import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IMediator {
    private List<User> users;

    public ChatMediator() {
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        notifyUsers(user.getName() + ": " + message, user);
    }

    @Override
    public void addUser(User user) {
        users.add(user);
        notifyUsers(user.getName() + " has joined the chat.", user);
    }

    @Override
    public void removeUser(User user) {
        users.remove(user);
        notifyUsers(user.getName() + " has left the chat.", user);
    }

    @Override
    public void notifyUsers(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }
}