public class File extends FileSyCom {
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Файл: " + name + " (" + size + " KB)");
    }

    @Override
    public int getSize() {
        return size;
    }
}
