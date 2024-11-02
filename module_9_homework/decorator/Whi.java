public class Whi extends BevDec {
    public Whi(Beverage bev) { super(bev); }
    public String desc() { return bev.desc() + ", Whipped Cream"; }
    public double cost() { return bev.cost() + 30.0; }
}