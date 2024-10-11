public class Main {
    public static void main(String[] args) {
        // Создание строителей
        IReportBuilder textReportBuilder = new TextReportBuilder();
        IReportBuilder htmlReportBuilder = new HtmlReportBuilder();

        // Директор для управления процессом построения отчетов
        ReportDirector director = new ReportDirector();

        // Создание текстового отчета
        director.constructReport(textReportBuilder, "Текстовый Отчет", "Это содержимое текстового отчета", "Текстовый подвал");
        Report textReport = textReportBuilder.getReport();
        System.out.println("Текстовый отчет:\n" + textReport);

        // Создание HTML отчета
        director.constructReport(htmlReportBuilder, "HTML Отчет", "Это содержимое HTML отчета", "HTML подвал");
        Report htmlReport = htmlReportBuilder.getReport();
        System.out.println("\nHTML отчет:\n" + htmlReport);
    }
}
