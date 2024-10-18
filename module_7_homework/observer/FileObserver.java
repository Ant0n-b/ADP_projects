import java.io.FileWriter;
import java.io.IOException;

public class FileObserver implements IObserver {
    private String filename;

    public FileObserver(String filename) {
        this.filename = filename;
    }

    @Override
    public void update(String currency, float exchangeRate) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(currency + " - " + exchangeRate + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
