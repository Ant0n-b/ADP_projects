public class ReportDirector {
    public void constructReport(IReportBuilder builder, ReportStyle style) {
        builder.setStyle(style);
        builder.setHeader("Отчет о продажах");
        builder.setContent("Содержание отчета о продажах за 2024 год.");
        builder.addSection("Раздел 1", "Динамические данные 1");
        builder.addSection("Раздел 2", "Динамические данные 2");
        builder.setFooter("Конец отчета");
    }
}
