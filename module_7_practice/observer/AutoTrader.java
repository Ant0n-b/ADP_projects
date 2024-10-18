public class AutoTrader implements IObserver {
    private String name;
    private double threshold;

    public AutoTrader(String name, double threshold) {
        this.name = name;
        this.threshold = threshold;
    }

    public void update(String stockSymbol, double newPrice) {
        if (newPrice > threshold) {
            System.out.printf("Авто трейдер %s: Покупка акции %s по цене %.2f%n", name, stockSymbol, newPrice);
        } else {
            System.out.printf("Авто трейдер %s: Продажа акции %s по цене %.2f%n", name, stockSymbol, newPrice);
        }
    }
}
