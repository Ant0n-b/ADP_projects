public class ReportGenerator {
    public void generateReport(String format) {
        // Логика генерации отчета в указанном формате
        System.out.println("Generating report in " + format + " format.");
    }
    
    // Пример использования:
    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator();
        generator.generateReport("PDF");  // Только необходимый формат
    }
}