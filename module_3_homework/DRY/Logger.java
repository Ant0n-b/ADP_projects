public class Logger {
    public void log(String message, String level) {
        System.out.println(level + ": " + message);
    }
    
    // Пример использования:
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log("This is an error", "ERROR");
        logger.log("This is a warning", "WARNING");
        logger.log("This is an info message", "INFO");
    }
}