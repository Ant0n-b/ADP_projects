public class EmailReport extends ReportGenerator {
    @Override
    protected void gatherData() {
        System.out.println("Сбор данных для Email отчета...");
    }

    @Override
    protected void formatData() {
        System.out.println("Форматирование данных для Email отчета...");
    }

    @Override
    protected void generateHeader() {
        System.out.println("Генерация заголовка Email отчета...");
    }

    @Override
    protected void generateContent() {
        System.out.println("Генерация содержимого Email отчета...");
    }

    @Override
    protected void saveReport() {
        System.out.println("Отправка Email отчета...");
    }
}
