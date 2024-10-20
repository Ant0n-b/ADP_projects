public class ReportClient {
    public static void main(String[] args) {
        System.out.println("Создание PDF отчета:");
        ReportGenerator pdfReport = new PdfReport();
        pdfReport.generateReport();

        System.out.println("\nСоздание Excel отчета:");
        ReportGenerator excelReport = new ExcelReport();
        excelReport.generateReport();

        System.out.println("\nСоздание HTML отчета:");
        ReportGenerator htmlReport = new HtmlReport();
        htmlReport.generateReport();
    }
}
