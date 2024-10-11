public class BuilderPatternDemo {
    public static void main(String[] args) {
        ReportDirector director = new ReportDirector();
        ReportStyle style = new ReportStyle("white", "black", 12);

        // Создание текстового отчета
        IReportBuilder textBuilder = new TextReportBuilder();
        director.constructReport(textBuilder, style);
        Report textReport = textBuilder.getReport();
        textReport.export();

        // Создание HTML отчета
        IReportBuilder htmlBuilder = new HtmlReportBuilder();
        director.constructReport(htmlBuilder, style);
        Report htmlReport = htmlBuilder.getReport();
        htmlReport.export();

        // Создание PDF отчета
        PdfReportBuilder pdfBuilder = new PdfReportBuilder();
        director.constructReport(pdfBuilder, style);
        Report pdfReport = pdfBuilder.getReport();
        pdfBuilder.exportToPdf("report.pdf");
    }
}
