import java.util.List;

public abstract class FileSyCom {
    protected String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public abstract void display(String indent);

    public abstract int getSize();

    
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Невозможно добавить компонент.");
    }

    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Невозможно удалить компонент.");
    }

    public List<FileSystemComponent> getChildren() {
        throw new UnsupportedOperationException("Нет дочерних компонентов.");
    }
}
