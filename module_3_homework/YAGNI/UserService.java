public class UserService {
    public void saveToDatabase(User user) {
        // Логика сохранения в базу данных
        System.out.println("Saving " + user.getName() + " to database.");
    }
    
    public void sendEmail(User user) {
        // Логика отправки email
        System.out.println("Sending email to " + user.getEmail());
    }
}