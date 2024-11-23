import java.time.LocalDate;

public class DateFilDec extends RepDec {
    private LocalDate startDate;
    private LocalDate endDate;

    public DateFilDec(IReport report, LocalDate startDate, LocalDate endDate) {
        super(report);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String generate() {
        return super.generate() + " | Filtered by date: " + startDate + " to " + endDate;
    }
}
