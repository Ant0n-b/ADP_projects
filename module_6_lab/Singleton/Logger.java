import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

enum LogLevel {
    INFO, WARNING, ERROR
}

public class Logger {
    private static Logger instance;
    private static final Object lock = new Object();
    private LogLevel currentLogLevel = LogLevel.INFO;
    private String logFilePath = "log.txt";

    // Приватный конструктор для предотвращения создания экземпляров извне
    private Logger() {
    }

    // Метод для получения единственного экземпляра класса (с потокобезопасностью)
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Метод для логирования сообщений с учетом уровня
    public void log(String message, LogLevel level) {
        if (level.ordinal() >= currentLogLevel.ordinal()) {
            synchronized (lock) {
                try (FileWriter fw = new FileWriter(logFilePath, true);
                     PrintWriter pw = new PrintWriter(fw)) {
                    String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    pw.printf("%s [%s]: %s%n", timestamp, level, message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Установка уровня логирования
    public void setLogLevel(LogLevel level) {
        currentLogLevel = level;
    }

    // Установка пути к файлу логов
    public void setLogFilePath(String path) {
        this.logFilePath = path;
    }

    // Чтение логов из файла и вывод их на экран
    public void displayLogs() {
        synchronized (lock) {
            try {
                java.nio.file.Files.lines(java.nio.file.Paths.get(logFilePath)).forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
