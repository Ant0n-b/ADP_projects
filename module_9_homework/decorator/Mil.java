public class Mil extends BevDec {
    public Mil(Beverage bev) { super(bev); }
    public String desc() { return bev.desc() + ", Milk"; }
    public double cost() { return bev.cost() + 20.0; }
}