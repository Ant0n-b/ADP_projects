public class LogAdaB implements IDel {
    private final ExtLogSerB extSerB;

    public LogAdaB(ExtLogSerB extSerB) {
        this.extSerB = extSerB;
    }

    @Override
    public void deliverOrder(String orderId) {
        extSerB.sendPackage("Order " + orderId);
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        return extSerB.checkPackageStatus(orderId);
    }
}