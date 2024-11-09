public class File extends FiSyCom {
    public File(String name) {
        super(name);
    }

    @Override
    public void display(int depth) {
        System.out.println(" ".repeat(depth) + "- File: " + name);
    }
}
