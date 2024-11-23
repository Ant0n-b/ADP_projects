public class LogAdaA implements IDel {
    private final ExtLogSerA extSerA;

    public LogAdaA(ExtLogSerA extSerA) {
        this.extSerA = extSerA;
    }

    @Override
    public void deliverOrder(String orderId) {
        int itemId = Integer.parseInt(orderId);
        extSerA.shipItem(itemId);
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        int shipmentId = Integer.parseInt(orderId);
        return extSerA.trackShipment(shipmentId);
    }
}