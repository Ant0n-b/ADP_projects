import java.util.Scanner;

public class ExcelReport extends ReportGenerator {
    @Override
    protected void gatherData() {
        System.out.println("Сбор данных для Excel отчета...");
    }

    @Override
    protected void formatData() {
        System.out.println("Форматирование данных для Excel отчета...");
    }

    @Override
    protected void generateHeader() {
        System.out.println("Генерация заголовка Excel отчета...");
    }

    @Override
    protected void generateContent() {
        System.out.println("Генерация содержимого Excel отчета...");
    }

    @Override
    protected void saveReport() {
        System.out.println("Сохранение Excel отчета...");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сохранить отчет? (да/нет): ");
        String input = scanner.nextLine();
        if (!input.equalsIgnoreCase("да")) {
            System.out.println("Отчет не сохранен.");
        } else {
            System.out.println("Excel отчет успешно сохранен.");
        }
    }
}
