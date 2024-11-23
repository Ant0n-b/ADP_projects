import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        IRep salRep = new SalesReport();

        // Применяем декораторы
        IReport filteredReport = new DateFilterDecorator(salesReport, LocalDate.of(2024, 1, 1), LocalDate.of(2024, 12, 31));
        IReport sortedReport = new SortingDecorator(filteredReport, "date");
        IReport csvReport = new CsvExportDecorator(sortedReport);
        IReport pdfReport = new PdfExportDecorator(sortedReport);

        // Вывод
        System.out.println("CSV Report: " + csvReport.generate());
        System.out.println("PDF Report: " + pdfReport.generate());
    }
}
