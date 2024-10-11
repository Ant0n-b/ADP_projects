import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    // Статическое поле для хранения единственного экземпляра
    private static volatile ConfigurationManager instance;
    private static final Object lock = new Object();
    private Map<String, String> settings;

    // Приватный конструктор
    private ConfigurationManager() {
        settings = new HashMap<>();
    }

    // Метод для получения экземпляра (с двойной проверкой и блокировкой)
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    // Метод для загрузки настроек из файла
    public void loadSettingsFromFile(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("Файл настроек не найден.");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    settings.put(parts[0], parts[1]);
                }
            }
        }
    }

    // Метод для сохранения настроек в файл
    public void saveSettingsToFile(String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Map.Entry<String, String> entry : settings.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue());
                writer.newLine();
            }
        }
    }

    // Метод для установки настройки
    public void setSetting(String key, String value) {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("Ключ не может быть пустым.");
        }
        settings.put(key, value);
    }

    // Метод для получения настройки
    public String getSetting(String key) {
        if (!settings.containsKey(key)) {
            throw new IllegalArgumentException("Настройка не найдена: " + key);
        }
        return settings.get(key);
    }

    // Метод для вывода всех настроек
    public void printSettings() {
        for (Map.Entry<String, String> entry : settings.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
