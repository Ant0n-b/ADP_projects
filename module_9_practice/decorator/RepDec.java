public abstract class RepDec implements IRep {
    protected IReport report;

    public RepDec(IReport report) {
        this.report = report;
    }

    @Override
    public String generate() {
        return report.generate();
    }
}
