public class ExtLogSerA {
    public void shipItem(int itemId) {
        System.out.println("Shipping item " + itemId + " via External Logistics Service A.");
    }

    public String trackShipment(int shipmentId) {
        return "Shipment " + shipmentId + " status from External Logistics Service A.";
    }
}