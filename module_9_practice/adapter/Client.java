public class Client {
    public static void main(String[] args) {
        
        IDel internalService = DelSerFac.getDeliveryService("internal");
        internalService.deliverOrder("12345");
        System.out.println(internalService.getDeliveryStatus("12345"));

        
        IDel externalServiceA = DelSerFac.getDeliveryService("external_a");
        externalServiceA.deliverOrder("67890");
        System.out.println(externalServiceA.getDeliveryStatus("67890"));

        
        IDel externalServiceB = DelSerFac.getDeliveryService("external_b");
        externalServiceB.deliverOrder("ABC123");
        System.out.println(externalServiceB.getDeliveryStatus("ABC123"));
    }
}