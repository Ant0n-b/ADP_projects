import java.math.BigDecimal;

public class InternationalShippingStrategy implements IShippingStrategy {
    public BigDecimal calculateShippingCost(BigDecimal weight, BigDecimal distance) {
        return weight.multiply(new BigDecimal("1.0"))
                     .add(distance.multiply(new BigDecimal("0.5")))
                     .add(new BigDecimal("15"));
    }
}
