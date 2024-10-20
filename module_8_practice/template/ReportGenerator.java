import java.util.logging.Logger;

public abstract class ReportGenerator {
    private static final Logger logger = Logger.getLogger(ReportGenerator.class.getName());

    
    public final void generateReport() {
        gatherData();
        formatData();
        generateHeader();
        generateContent();
        if (customerWantsSave()) {
            saveReport();
        }
        finalizeReport();
    }

    protected abstract void gatherData();
    protected abstract void formatData();
    protected abstract void generateHeader();
    protected abstract void generateContent();
    protected abstract void saveReport();

    protected boolean customerWantsSave() {
        return true;
    }

    private void finalizeReport() {
        logger.info("Отчет успешно сгенерирован.");
    }
}
