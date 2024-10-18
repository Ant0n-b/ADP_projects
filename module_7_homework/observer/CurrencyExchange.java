public class CurrencyExchange implements ISubject {
    private List<IObserver> observers;
    private float usdToEurRate;

    public CurrencyExchange() {
        observers = new ArrayList<>();
    }

    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update("USD/EUR", usdToEurRate);
        }
    }

    public void setExchangeRate(float newRate) {
        this.usdToEurRate = newRate;
        notifyObservers();
    }
}
