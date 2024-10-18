public class TravelBookingContext {
    private ICostCalculationStrategy costCalculationStrategy;

    public void setCostCalculationStrategy(ICostCalculationStrategy strategy) {
        this.costCalculationStrategy = strategy;
    }

    public double calculateTravelCost(double distance, int passengers, String serviceClass, boolean hasDiscount) {
        if (costCalculationStrategy == null) {
            throw new IllegalArgumentException("Стратегия расчета стоимости не установлена.");
        }
        return costCalculationStrategy.calculateCost(distance, passengers, serviceClass, hasDiscount);
    }
}
