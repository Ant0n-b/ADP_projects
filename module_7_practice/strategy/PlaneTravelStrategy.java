public class PlaneTravelStrategy implements ICostCalculationStrategy {
    @Override
    public double calculateCost(double distance, int passengers, String serviceClass, boolean hasDiscount) {
        double baseCost = distance * 0.5;
        double classCost = serviceClass.equalsIgnoreCase("business") ? 100 : 0; 
        double totalCost = (baseCost + classCost) * passengers;

        if (hasDiscount) {
            totalCost *= 0.9; 
        }
        
        return totalCost;
    }
}
