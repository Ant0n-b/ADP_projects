import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Logger {
    private static Logger instance;
    private static final Lock lock = new ReentrantLock();
    private LogLevel currentLogLevel;
    private String logFilePath;

    // Приватный конструктор
    private Logger() {
        this.currentLogLevel = LogLevel.INFO; // Уровень логирования по умолчанию
        this.logFilePath = "log.txt"; // Путь к файлу логов по умолчанию
    }

    // Статический метод для получения единственного экземпляра логгера
    public static Logger getInstance() {
        if (instance == null) {
            lock.lock();
            try {
                if (instance == null) {
                    instance = new Logger();
                }
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }

    // Метод для логирования сообщений
    public void log(String message, LogLevel level) {
        if (level.ordinal() >= currentLogLevel.ordinal()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFilePath, true))) {
                writer.write(level + ": " + message);
                writer.newLine();
            } catch (IOException e) {
                System.err.println("Ошибка записи в лог: " + e.getMessage());
            }
        }
    }

    // Метод для изменения уровня логирования
    public void setLogLevel(LogLevel level) {
        this.currentLogLevel = level;
    }

    // Метод для загрузки конфигурации
    public void loadConfig(String configFilePath) {
        try {
            String config = new String(Files.readAllBytes(Paths.get(configFilePath)));
            String[] lines = config.split("\n");
            for (String line : lines) {
                String[] parts = line.split("=");
                if (parts[0].trim().equalsIgnoreCase("logLevel")) {
                    setLogLevel(LogLevel.valueOf(parts[1].trim().toUpperCase()));
                } else if (parts[0].trim().equalsIgnoreCase("logFilePath")) {
                    logFilePath = parts[1].trim();
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка загрузки конфигурации: " + e.getMessage());
        }
    }
}
