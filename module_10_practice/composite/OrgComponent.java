import java.util.ArrayList;
import java.util.List;

public abstract class OrgComponent {
    protected String name;

    public OrgComponent(String name) {
        this.name = name;
    }

    public abstract void display(int depth);
    public double calculateBudget() {
        return 0;
    }
    public int countEmployees() {
        return 0;
    }
    public void add(OrgComponent component) {
        throw new UnsupportedOperationException();
    }
    public void remove(OrgComponent component) {
        throw new UnsupportedOperationException();
    }
}
