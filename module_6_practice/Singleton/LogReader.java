import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogReader {
    private String logFilePath;

    public LogReader(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    // Метод для чтения и фильтрации логов
    public void readLogs(LogLevel filterLevel) {
        try (BufferedReader reader = new BufferedReader(new FileReader(logFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(filterLevel.toString())) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения логов: " + e.getMessage());
        }
    }
}