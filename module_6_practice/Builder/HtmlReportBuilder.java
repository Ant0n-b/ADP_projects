public class HtmlReportBuilder implements IReportBuilder {
    private Report report;

    public HtmlReportBuilder() {
        report = new Report();
    }

    @Override
    public void setHeader(String header) {
        report.setHeader("<h1>" + header + "</h1>");
    }

    @Override
    public void setContent(String content) {
        report.setContent("<p>" + content + "</p>");
    }

    @Override
    public void setFooter(String footer) {
        report.setFooter("<footer>" + footer + "</footer>");
    }

    @Override
    public void addSection(String sectionName, String sectionContent) {
        report.addSection("<h2>" + sectionName + "</h2><p>" + sectionContent + "</p>");
    }

    @Override
    public void setStyle(ReportStyle style) {
        report.setStyle(style);
    }

    @Override
    public Report getReport() {
        return report;
    }
}
