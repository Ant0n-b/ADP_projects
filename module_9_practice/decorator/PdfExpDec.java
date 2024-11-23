public class PdfExpDec extends RepDec {
    public PdfExpDec(IReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return super.generate() + " | Exported to PDF";
    }
}
