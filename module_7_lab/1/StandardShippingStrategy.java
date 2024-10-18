import java.math.BigDecimal;

public class StandardShippingStrategy implements IShippingStrategy {
    public BigDecimal calculateShippingCost(BigDecimal weight, BigDecimal distance) {
        return weight.multiply(new BigDecimal("0.5")).add(distance.multiply(new BigDecimal("0.1")));
    }
}
