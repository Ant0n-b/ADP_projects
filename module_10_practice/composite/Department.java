public class Department extends OrgComponent {
    private List<OrgComponent> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(OrgComponent component) {
        components.add(component);
    }

    @Override
    public void remove(OrgComponent component) {
        components.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println(" ".repeat(depth) + "+ Department: " + name);
        for (OrgComponent component : components) {
            component.display(depth + 2);
        }
    }

    @Override
    public double calculateBudget() {
        return components.stream().mapToDouble(OrgComponent::calculateBudget).sum();
    }

    @Override
    public int countEmployees() {
        return components.stream().mapToInt(OrgComponent::countEmployees).sum();
    }
}
