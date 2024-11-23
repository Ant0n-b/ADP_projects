public class IntDelSer implements IDel {
    @Override
    public void deliverOrder(String orderId) {
        System.out.println("Delivering order " + orderId + " using internal service.");
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        return "Order " + orderId + " is in transit via internal service.";
    }
}