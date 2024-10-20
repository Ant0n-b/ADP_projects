public class HtmlReport extends ReportGenerator {
    @Override
    protected void gatherData() {
        System.out.println("Сбор данных для HTML отчета...");
    }

    @Override
    protected void formatData() {
        System.out.println("Форматирование данных для HTML отчета...");
    }

    @Override
    protected void generateHeader() {
        System.out.println("Генерация заголовка HTML отчета...");
    }

    @Override
    protected void generateContent() {
        System.out.println("Генерация содержимого HTML отчета...");
    }

    @Override
    protected void saveReport() {
        System.out.println("Сохранение HTML отчета...");
    }
}
