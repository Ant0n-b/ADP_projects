public class CsvExpDec extends RepDec {
    public CsvExpDec(IReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return super.generate() + " | Exported to CSV";
    }
}
