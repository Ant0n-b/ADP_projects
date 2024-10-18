import java.util.*;

public class StockExchange implements ISubject {
    private Map<String, List<IObserver>> observers;
    private Map<String, Double> stockPrices;

    public StockExchange() {
        observers = new HashMap<>();
        stockPrices = new HashMap<>();
    }

    public void setStockPrice(String stockSymbol, double price) {
        stockPrices.put(stockSymbol, price);
        notifyObservers(stockSymbol, price);
    }

    public void registerObserver(String stockSymbol, IObserver observer) {
        observers.computeIfAbsent(stockSymbol, k -> new ArrayList<>()).add(observer);
    }

    public void removeObserver(String stockSymbol, IObserver observer) {
        List<IObserver> observersList = observers.get(stockSymbol);
        if (observersList != null) {
            observersList.remove(observer);
        }
    }

    public void notifyObservers(String stockSymbol, double newPrice) {
        List<IObserver> observersList = observers.get(stockSymbol);
        if (observersList != null) {
            for (IObserver observer : observersList) {
                observer.update(stockSymbol, newPrice);
            }
        }
    }
}
