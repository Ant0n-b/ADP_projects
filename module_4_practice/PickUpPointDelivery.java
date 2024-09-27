public class PickUpPointDelivery implements IDelivery {
    @Override
    public void deliverOrder(Order order) {
        System.out.println("Customer will pick up order from pick-up point");
    }
}