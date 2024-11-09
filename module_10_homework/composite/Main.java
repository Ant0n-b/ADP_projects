public class Main {
    public static void main(String[] args) {
        // Создание файлов
        File file1 = new File("Document.docx", 120);
        File file2 = new File("Image.jpg", 350);
        File file3 = new File("Video.mp4", 2000);
        File file4 = new File("Music.mp3", 500);

        // Создание папок
        Directory root = new Directory("Root");
        Directory documents = new Directory("Documents");
        Directory media = new Directory("Media");
        Directory images = new Directory("Images");
        Directory videos = new Directory("Videos");

        // Формирование структуры
        root.add(documents);
        root.add(media);

        documents.add(file1);

        media.add(images);
        media.add(videos);

        images.add(file2);
        videos.add(file3);
        videos.add(file4);

        // Вывод структуры и размеров
        System.out.println("Содержимое файловой системы:");
        root.display("");

        System.out.println("\nОбщий размер файловой системы: " + root.getSize() + " KB");

        // Удаление компонента
        System.out.println("\nУдаление файла Image.jpg...");
        images.remove(file2);

        System.out.println("\nСодержимое файловой системы после удаления:");
        root.display("");

        System.out.println("\nОбщий размер файловой системы: " + root.getSize() + " KB");
    }
}
