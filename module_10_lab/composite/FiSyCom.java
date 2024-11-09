import java.util.List;

public abstract class FiSyCom {
    protected String name;

    public FiSyCom(String name) {
        this.name = name;
    }

    public abstract void display(int depth);

    public void add(FiSyCom component) {
        throw new UnsupportedOperationException("Add operation is not supported.");
    }

    public void remove(FiSyCom component) {
        throw new UnsupportedOperationException("Remove operation is not supported.");
    }

    public List<FiSyCom> getChildren() {
        throw new UnsupportedOperationException("No children available.");
    }
}
