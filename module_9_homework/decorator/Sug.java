public class Sug extends BevDec {
    public Sug(Beverage bev) { super(bev); }
    public String desc() { return bev.desc() + ", Sugar"; }
    public double cost() { return bev.cost() + 10.0; }
}