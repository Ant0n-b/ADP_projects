public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        // Добавление пользователей
        userManager.addUser("Alice", "alice@example.com", "Admin");
        userManager.addUser("Bob", "bob@example.com", "User");

        // Отображение пользователей
        userManager.displayUsers();

        // Обновление информации о пользователе
        userManager.updateUser("bob@example.com", "Bob Jr.", "bobjr@example.com", "Admin");

        // Отображение пользователей после обновления
        userManager.displayUsers();

        // Удаление пользователя
        userManager.removeUser("alice@example.com");

        // Отображение пользователей после удаления
        userManager.displayUsers();
    }
}