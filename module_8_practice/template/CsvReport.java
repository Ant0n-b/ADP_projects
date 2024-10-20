public class CsvReport extends ReportGenerator {
    @Override
    protected void gatherData() {
        System.out.println("Сбор данных для CSV отчета...");
    }

    @Override
    protected void formatData() {
        System.out.println("Форматирование данных для CSV отчета...");
    }

    @Override
    protected void generateHeader() {
        System.out.println("Генерация заголовка CSV отчета...");
    }

    @Override
    protected void generateContent() {
        System.out.println("Генерация содержимого CSV отчета...");
    }

    @Override
    protected void saveReport() {
        System.out.println("Сохранение CSV отчета...");
    }
}
