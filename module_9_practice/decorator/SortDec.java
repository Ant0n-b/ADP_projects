public class SortDec extends RepDec {
    private String criteria;

    public SortDec(IReport report, String criteria) {
        super(report);
        this.criteria = criteria;
    }

    @Override
    public String generate() {
        return super.generate() + " | Sorted by: " + criteria;
    }
}
