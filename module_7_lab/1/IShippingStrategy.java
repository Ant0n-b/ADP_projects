import java.math.BigDecimal;

public interface IShippingStrategy {
    BigDecimal calculateShippingCost(BigDecimal weight, BigDecimal distance);
}
