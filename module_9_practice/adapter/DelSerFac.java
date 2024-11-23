public class DelSerFac {
    public static IDel getDeliveryService(String type) {
        return switch (type.toLowerCase()) {
            case "internal" -> new IntDelSer();
            case "external_a" -> new LogAdaA(new ExtLogSerA());
            case "external_b" -> new LogAdaB(new ExtLogSerB());
            default -> throw new IllegalArgumentException("Unknown delivery service type: " + type);
        };
    }
}