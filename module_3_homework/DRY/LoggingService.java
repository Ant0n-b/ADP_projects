public class LoggingService {
    public void log(String message) {
        String connectionString = Configuration.CONNECTION_STRING;
        // Логика записи лога в базу данных
        System.out.println("Logging to database: " + connectionString);
    }
}