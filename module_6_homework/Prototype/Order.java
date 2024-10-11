import java.util.ArrayList;
import java.util.List;

public class Order implements ICloneable {
    private List<Product> products;
    private double shippingCost;
    private Discount discount;
    private String paymentMethod;

    public Order(List<Product> products, double shippingCost, Discount discount, String paymentMethod) {
        this.products = products;
        this.shippingCost = shippingCost;
        this.discount = discount;
        this.paymentMethod = paymentMethod;
    }

    // Клонирование объекта Order с глубоким копированием всех вложенных объектов
    @Override
    public Order clone() {
        // Клонируем список товаров
        List<Product> clonedProducts = new ArrayList<>();
        for (Product product : products) {
            clonedProducts.add(product.clone());
        }
        // Клонируем скидку
        Discount clonedDiscount = discount.clone();
        // Возвращаем новый заказ
        return new Order(clonedProducts, this.shippingCost, clonedDiscount, this.paymentMethod);
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", shippingCost=" + shippingCost +
                ", discount=" + discount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
