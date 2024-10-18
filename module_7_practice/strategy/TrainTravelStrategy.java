public class TrainTravelStrategy implements ICostCalculationStrategy {
    @Override
    public double calculateCost(double distance, int passengers, String serviceClass, boolean hasDiscount) {
        double baseCost = distance * 0.3; 
        double classCost = serviceClass.equalsIgnoreCase("business") ? 50 : 0; 
        double totalCost = (baseCost + classCost) * passengers;

        if (hasDiscount) {
            totalCost *= 0.85; 
        }
        
        return totalCost;
    }
}
