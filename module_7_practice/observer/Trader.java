public class Trader implements IObserver {
    private String name;

    public Trader(String name) {
        this.name = name;
    }

    public void update(String stockSymbol, double newPrice) {
        System.out.printf("Трейдер %s: Цена акции %s изменилась на %.2f%n", name, stockSymbol, newPrice);
    }
}
