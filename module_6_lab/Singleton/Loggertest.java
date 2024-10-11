public class LoggerTest {
    public static void main(String[] args) {
        // Установка уровня логирования и пути к файлу
        Logger logger = Logger.getInstance();
        logger.setLogLevel(LogLevel.INFO);
        logger.setLogFilePath("application.log");

        // Создание нескольких потоков для записи логов
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(LoggerTest::logMessages);
            threads[i].start();
        }

        // Ждем завершения всех потоков
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Отображаем записанные логи
        logger.displayLogs();
    }

    // Метод для записи сообщений в лог
    public static void logMessages() {
        Logger logger = Logger.getInstance();
        logger.log("This is an info message.", LogLevel.INFO);
        logger.log("This is a warning message.", LogLevel.WARNING);
        logger.log("This is an error message.", LogLevel.ERROR);
    }
}
