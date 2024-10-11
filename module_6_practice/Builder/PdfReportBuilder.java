import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfReportBuilder implements IReportBuilder {
    private Report report;
    private Document document;

    public PdfReportBuilder() {
        report = new Report();
        document = new Document();
    }

    @Override
    public void setHeader(String header) {
        report.setHeader(header);
    }

    @Override
    public void setContent(String content) {
        report.setContent(content);
    }

    @Override
    public void setFooter(String footer) {
        report.setFooter(footer);
    }

    @Override
    public void addSection(String sectionName, String sectionContent) {
        report.addSection(sectionName + ": " + sectionContent);
    }

    @Override
    public void setStyle(ReportStyle style) {
        report.setStyle(style);
    }

    @Override
    public Report getReport() {
        return report;
    }

    public void exportToPdf(String filePath) {
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            document.add(new com.itextpdf.text.Paragraph(report.getHeader()));
            document.add(new com.itextpdf.text.Paragraph(report.getContent()));
            for (String section : report.getSections()) {
                document.add(new com.itextpdf.text.Paragraph(section));
            }
            document.add(new com.itextpdf.text.Paragraph(report.getFooter()));
            document.close();
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
