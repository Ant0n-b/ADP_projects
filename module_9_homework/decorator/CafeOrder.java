public class CafeOrder {
    public static void main(String[] args) {
        Beverage order = new Moc();
        order = new Mil(order);
        order = new Sug(order);
        order = new Whi(order);
        
        System.out.println("Order: " + order.desc());
        System.out.println("Total cost: " + order.cost() + " KZT");
        
        Beverage order2 = new Tea();
        order2 = new Syr(order2);
        order2 = new Mil(order2);
        
        System.out.println("Order: " + order2.desc());
        System.out.println("Total cost: " + order2.cost() + " KZT");
    }
}