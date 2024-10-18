import java.math.BigDecimal;

public class DeliveryContext {
    private IShippingStrategy shippingStrategy;

    public void setShippingStrategy(IShippingStrategy strategy) {
        this.shippingStrategy = strategy;
    }

    public BigDecimal calculateCost(BigDecimal weight, BigDecimal distance) {
        if (shippingStrategy == null) {
            throw new IllegalStateException("Доставка не установлена.");
        }
        return shippingStrategy.calculateShippingCost(weight, distance);
    }
}