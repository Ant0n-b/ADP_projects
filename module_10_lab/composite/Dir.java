import java.util.ArrayList;
import java.util.List;

public class Dir extends FiSyCom {
    private List<FiSymCom> components = new ArrayList<>();

    public Dir(String name) {
        super(name);
    }

    @Override
    public void add(FiSyCom component) {
        components.add(component);
    }

    @Override
    public void remove(FiSyCom component) {
        components.remove(component);
    }

    @Override
    public List<FiSyCom> getChildren() {
        return components;
    }

    @Override
    public void display(int depth) {
        System.out.println(" ".repeat(depth) + "+ Directory: " + name);
        for (FiSyCom component : components) {
            component.display(depth + 2);
        }
    }
}
