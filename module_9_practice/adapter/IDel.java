public interface IDel {
    void deliverOrder(String orderId);
    String getDeliveryStatus(String orderId);
}