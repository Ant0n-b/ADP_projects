public class Discount implements ICloneable {
    private double discountValue;

    public Discount(double discountValue) {
        this.discountValue = discountValue;
    }

    // Клонирование объекта Discount
    @Override
    public Discount clone() {
        return new Discount(this.discountValue);
    }

    @Override
    public String toString() {
        return "Discount{" +
                "discountValue=" + discountValue +
                '}';
    }
}
