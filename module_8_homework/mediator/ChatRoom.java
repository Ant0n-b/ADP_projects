import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements IMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
        System.out.println(user.getName() + " joined the chat.");
        notifyUsers(user, "joined");
    }

    @Override
    public void removeUser(User user) {
        users.remove(user);
        System.out.println(user.getName() + " left the chat.");
        notifyUsers(user, "left");
    }

    @Override
    public void sendMessage(String message, User sender) {
        if (users.contains(sender)) {
            for (User user : users) {
                if (user != sender) {
                    user.receive(message, sender);
                }
            }
        } else {
            System.out.println(sender.getName() + " is not part of this chat.");
        }
    }

    @Override
    public void sendPrivateMessage(String message, User sender, User receiver) {
        if (users.contains(sender) && users.contains(receiver)) {
            receiver.receive(message, sender);
            System.out.println(sender.getName() + " privately sent a message to " + receiver.getName());
        } else {
            System.out.println("Private message failed: one of the users is not in the chat.");
        }
    }

    @Override
    public void sendGroupMessage(String message, User sender, List<User> group) {
        if (users.contains(sender)) {
            for (User user : group) {
                if (user != sender && users.contains(user)) {
                    user.receive(message, sender);
                }
            }
            System.out.println(sender.getName() + " sent a group message.");
        } else {
            System.out.println("Sender is not part of the chat.");
        }
    }

    private void notifyUsers(User user, String action) {
        for (User u : users) {
            if (u != user) {
                u.receiveNotification(user.getName() + " has " + action + " the chat.");
            }
        }
    }
}
