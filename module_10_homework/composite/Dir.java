import java.util.ArrayList;
import java.util.List;

public class Dir extends FileSyCom {
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void add(FileSystemComponent component) {
        if (!components.contains(component)) {
            components.add(component);
        } else {
            System.out.println("Компонент с именем \"" + component.name + "\" уже существует в папке \"" + name + "\".");
        }
    }

    @Override
    public void remove(FileSystemComponent component) {
        if (components.contains(component)) {
            components.remove(component);
        } else {
            System.out.println("Компонент с именем \"" + component.name + "\" не найден в папке \"" + name + "\".");
        }
    }

    @Override
    public List<FileSystemComponent> getChildren() {
        return components;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Папка: " + name);
        for (FileSystemComponent component : components) {
            component.display(indent + "  ");
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }
}
