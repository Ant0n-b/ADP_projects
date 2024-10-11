import java.util.ArrayList;
import java.util.List;

public class Report {
    private String header;
    private String content;
    private String footer;
    private List<String> sections;
    private ReportStyle style;

    public Report() {
        sections = new ArrayList<>();
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public void addSection(String section) {
        sections.add(section);
    }

    public void setStyle(ReportStyle style) {
        this.style = style;
    }

    public void export() {
        System.out.println("Exporting report...");
        System.out.println("Header: " + header);
        System.out.println("Content: " + content);
        for (String section : sections) {
            System.out.println("Section: " + section);
        }
        System.out.println("Footer: " + footer);
        System.out.println("Style - Background: " + style.getBackgroundColor() + ", Font Color: " + style.getFontColor() + ", Font Size: " + style.getFontSize());
    }
}
