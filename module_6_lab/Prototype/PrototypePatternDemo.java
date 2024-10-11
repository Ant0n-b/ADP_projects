public class PrototypePatternDemo {
    public static void main(String[] args) {
        // Создаем оригинальный документ
        Document originalDoc = new Document("Документ 1", "Содержимое документа 1");
        originalDoc.addSection(new Section("Раздел 1", "Текст раздела 1"));
        originalDoc.addImage(new Image("http://example.com/image1.png"));

        // Клонируем документ
        DocumentManager documentManager = new DocumentManager();
        Document clonedDoc = (Document) documentManager.createDocument(originalDoc);

        // Изменяем клонированный документ
        clonedDoc.setTitle("Клонированный документ");
        clonedDoc.setContent("Измененное содержимое");
        clonedDoc.getSections().get(0).setText("Измененный текст раздела 1");
        clonedDoc.addImage(new Image("http://example.com/image2.png"));

        // Выводим информацию об оригинальном и клонированном документах
        System.out.println("Оригинальный документ: ");
        System.out.println("Заголовок: " + originalDoc.getTitle());
        System.out.println("Содержимое: " + originalDoc.getContent());
        for (Section section : originalDoc.getSections()) {
            System.out.println("Раздел: " + section.getTitle() + " - " + section.getText());
        }
        for (Image image : originalDoc.getImages()) {
            System.out.println("Изображение: " + image.getUrl());
        }

        System.out.println("\nКлонированный документ: ");
        System.out.println("Заголовок: " + clonedDoc.getTitle());
        System.out.println("Содержимое: " + clonedDoc.getContent());
        for (Section section : clonedDoc.getSections()) {
            System.out.println("Раздел: " + section.getTitle() + " - " + section.getText());
        }
        for (Image image : clonedDoc.getImages()) {
            System.out.println("Изображение: " + image.getUrl());
        }
    }
}
