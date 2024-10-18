import java.math.BigDecimal;

public class NightShippingStrategy implements IShippingStrategy {
    public BigDecimal calculateShippingCost(BigDecimal weight, BigDecimal distance) {
        return weight.multiply(new BigDecimal("0.75"))
                     .add(distance.multiply(new BigDecimal("0.3")))
                     .add(new BigDecimal("20"));
    }
}
