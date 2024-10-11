public class LoggingTest {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        
        // Загрузка конфигурации (если нужно)
        logger.loadConfig("config.txt");

        Runnable logTask = () -> {
            String threadName = Thread.currentThread().getName();
            logger.log(threadName + " - информационное сообщение", LogLevel.INFO);
            logger.log(threadName + " - предупреждение", LogLevel.WARNING);
            logger.log(threadName + " - ошибка", LogLevel.ERROR);
        };

        // Создание нескольких потоков для тестирования
        Thread thread1 = new Thread(logTask, "Поток 1");
        Thread thread2 = new Thread(logTask, "Поток 2");
        Thread thread3 = new Thread(logTask, "Поток 3");

        thread1.start();
        thread2.start();
        thread3.start();

        // Ожидание завершения потоков
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Чтение логов
        LogReader logReader = new LogReader("log.txt");
        logReader.readLogs(LogLevel.INFO);
    }
}
