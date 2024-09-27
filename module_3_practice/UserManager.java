import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    // Метод для добавления пользователя
    public void addUser(String name, String email, String role) {
        users.add(new User(name, email, role));
        System.out.println("User " + name + " added successfully.");
    }

    // Метод для удаления пользователя по email
    public void removeUser(String email) {
        User userToRemove = findUserByEmail(email);
        if (userToRemove != null) {
            users.remove(userToRemove);
            System.out.println("User with email " + email + " removed successfully.");
        } else {
            System.out.println("User with email " + email + " not found.");
        }
    }

    // Метод для обновления пользователя по email
    public void updateUser(String email, String newName, String newEmail, String newRole) {
        User userToUpdate = findUserByEmail(email);
        if (userToUpdate != null) {
            userToUpdate.update(newName, newEmail, newRole);
            System.out.println("User with email " + email + " updated successfully.");
        } else {
            System.out.println("User with email " + email + " not found.");
        }
    }

    // Приватный метод для поиска пользователя по email
    private User findUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    // Метод для отображения всех пользователей
    public void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("No users available.");
        } else {
            System.out.println("User List:");
            for (User user : users) {
                System.out.println(user);
            }
        }
    }
}