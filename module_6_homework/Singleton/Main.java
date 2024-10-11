import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            final int threadId = i;
            executor.submit(() -> {
                ConfigurationManager configManager = ConfigurationManager.getInstance();
                configManager.setSetting("Thread" + threadId, "Value" + threadId);
                System.out.println("Thread " + threadId + ": Setting = " + configManager.getSetting("Thread" + threadId));
            });
        }

        executor.shutdown();

        // Сохранение настроек в файл
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        try {
            configManager.saveSettingsToFile("settings.txt");
            System.out.println("Настройки успешно сохранены в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
