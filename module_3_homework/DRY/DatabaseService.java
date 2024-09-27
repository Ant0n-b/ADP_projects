public class DatabaseService {
    public void connect() {
        String connectionString = Configuration.CONNECTION_STRING;
        // Логика подключения к базе данных
        System.out.println("Connecting to database: " + connectionString);
    }
}