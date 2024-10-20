public class PdfReport extends ReportGenerator {
    @Override
    protected void gatherData() {
        System.out.println("Сбор данных для PDF отчета...");
    }

    @Override
    protected void formatData() {
        System.out.println("Форматирование данных для PDF отчета...");
    }

    @Override
    protected void generateHeader() {
        System.out.println("Генерация заголовка PDF отчета...");
    }

    @Override
    protected void generateContent() {
        System.out.println("Генерация содержимого PDF отчета...");
    }

    @Override
    protected void saveReport() {
        System.out.println("Сохранение PDF отчета...");
    }
}
