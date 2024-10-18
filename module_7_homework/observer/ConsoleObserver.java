public class ConsoleObserver implements IObserver {
    private String name;

    public ConsoleObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String currency, float exchangeRate) {
        System.out.println(name + " получил обновление: " + currency + " - " + exchangeRate);
    }
}
