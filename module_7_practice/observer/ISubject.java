public interface ISubject {
    void registerObserver(String stockSymbol, IObserver observer);
    void removeObserver(String stockSymbol, IObserver observer);
    void notifyObservers(String stockSymbol, double newPrice);
}
