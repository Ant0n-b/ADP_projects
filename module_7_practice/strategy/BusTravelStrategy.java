public class BusTravelStrategy implements ICostCalculationStrategy {
    @Override
    public double calculateCost(double distance, int passengers, String serviceClass, boolean hasDiscount) {
        double baseCost = distance * 0.2; 
        double totalCost = baseCost * passengers;

        if (hasDiscount) {
            totalCost *= 0.95; 
        }
        
        return totalCost;
    }
}
