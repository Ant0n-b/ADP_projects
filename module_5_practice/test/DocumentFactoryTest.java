


package test;

import documents.creators.*;
import documents.Document;




import java.util.Scanner;

public class DocumentFactoryTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of document you want to create (report, resume, letter, invoice):");
        String documentType = scanner.nextLine().toLowerCase();

        // Выбор типа документа на основе пользовательского ввода
        DocumentCreator creator = getDocumentCreator(documentType);
        if (creator != null) {
            Document document = creator.createDocument();
            document.open();
        } else {
            System.out.println("Unknown document type: " + documentType);
        }

        scanner.close();
    }

    // Метод для динамического выбора фабрики в зависимости от типа документа
    private static DocumentCreator getDocumentCreator(String documentType) {
        switch (documentType) {
            case "report":
                return new ReportCreator();
            case "resume":
                return new ResumeCreator();
            case "letter":
                return new LetterCreator();
            case "invoice":
                return new InvoiceCreator();
            default:
                return null;
        }
    }
}