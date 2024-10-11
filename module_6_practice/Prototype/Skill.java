public class Skill implements ICloneable {
    private String name;
    private int power;

    public Skill(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public ICloneable clone() {
        return new Skill(name, power);
    }

    @Override
    public String toString() {
        return "Skill{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
