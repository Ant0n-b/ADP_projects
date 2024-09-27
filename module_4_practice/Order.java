import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<>();
    private double totalPrice;
    private IPayment payment;
    private IDelivery delivery;
    
    public void addItem(OrderItem item) {
        items.add(item);
    }
    
    public double calculateTotalPrice(DiscountCalculator discountCalculator) {
        totalPrice = items.stream().mapToDouble(OrderItem::getPrice).sum();
        return discountCalculator.calculateDiscount(totalPrice);
    }
    
    public void setPayment(IPayment payment) {
        this.payment = payment;
    }
    
    public void setDelivery(IDelivery delivery) {
        this.delivery = delivery;
    }
    
    public void processOrder() {
        payment.processPayment(totalPrice);
        delivery.deliverOrder(this);
    }

    public List<OrderItem> getItems() {
        return items;
    }
}

